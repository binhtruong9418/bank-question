/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Question;
import view.question.ListQuestionTableHeader;

public class ListQuestionSelectableTable extends JTable {

    private List<Question> selectedQuestions;

    public ListQuestionSelectableTable() {
        selectedQuestions = new ArrayList<>();
        setShowHorizontalLines(true);
        setShowVerticalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(35);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                ListQuestionTableHeader header = new ListQuestionTableHeader(o + "");
                if (i1 == 0) {
                    header.setHorizontalAlignment(SwingConstants.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);

                if (i1 == 0) {
                    com.setForeground(new Color(7, 116, 163));
                    setHorizontalAlignment(SwingConstants.CENTER);
                } else {
                    com.setForeground(new Color(102, 102, 102));
                    setHorizontalAlignment(SwingConstants.LEFT);
                }
                setBorder(noFocusBorder);
                if (i % 2 == 0) {
                    com.setBackground(Color.WHITE);
                } else {
                    com.setBackground(new Color(242, 242, 242));
                }

                if (o instanceof Question) {
                    Question question = (Question) o;
                    setValue(question.toString());
                }
                return com;
            }
        });

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class; // Set the checkbox column class to Boolean
                }
                return super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Make only the checkbox column editable
            }
        };
        model.addColumn("Select"); // Add a column for checkboxes
        model.addColumn("Question"); // Add a column for checkboxes

        setModel(model);
        TableColumn selectColumn = getColumnModel().getColumn(0);
        selectColumn.setPreferredWidth(70); // Set the preferred width for the select column
        selectColumn.setResizable(false); // Disable resizing for the select column

        TableColumn questionColumn = getColumnModel().getColumn(1);
        questionColumn.setPreferredWidth(1500); // Set the preferred width for the question column
        questionColumn.setResizable(false); // Disable resizing for the select column

        getColumnModel().getColumn(0).setCellRenderer(new CheckBoxRenderer());

        // Add a table model listener to listen for changes in the table data
        getModel().addTableModelListener((TableModelEvent e) -> {
            if (e.getColumn() == 0) { // Only process changes in the checkbox column
                int row = e.getFirstRow();
                boolean selected = (boolean) getModel().getValueAt(row, 0);
                Question question = (Question) getModel().getValueAt(row, 1);

                if (selected) {
                    selectedQuestions.add(question); // Add the selected question to the list
                } else {
                    selectedQuestions.remove(question); // Remove the deselected question from the list
                }
            }
        });
    }

    public void addRow(Question question) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(new Object[]{false, question});
    }

    public List<Question> getSelectedQuestions() {
        return selectedQuestions;
    }
}
