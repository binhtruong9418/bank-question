/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Question;
import view.question.ListQuestionTableHeader;

public class ListQuestionRandomTable extends JTable {

    public ListQuestionRandomTable() {
        setShowHorizontalLines(true);
        setShowVerticalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(35);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                ListQuestionTableHeader header = new ListQuestionTableHeader(o + "");
                header.setHorizontalAlignment(SwingConstants.CENTER);
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);

                com.setForeground(new Color(102, 102, 102));
                setHorizontalAlignment(SwingConstants.LEFT);
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

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Question"); // Add a column for checkboxes

        setModel(model);
        TableColumn selectColumn = getColumnModel().getColumn(0);
    }

    public void addRow(Question question) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(new Object[]{question});
    }
}
