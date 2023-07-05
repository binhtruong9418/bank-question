package view.quiz.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Question;
import view.question.ListQuestionTableHeader;

public class ListQuestionEditTable extends JTable {

    private static int time = 0;
    private ListQuestionEditTableListener listener;

    public ListQuestionEditTable() {
        setShowHorizontalLines(true);
        setShowVerticalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(35);
        getTableHeader().setReorderingAllowed(false);
    }

    public void setListQuestionEditTableListener(ListQuestionEditTableListener listener) {
        this.listener = listener;
    }

    public void updateTable(Boolean showCheckbox) {
        if (showCheckbox) {
            getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                    ListQuestionTableHeader header = new ListQuestionTableHeader(o + "");
                    if (i1 != 1) {
                        header.setHorizontalAlignment(SwingConstants.CENTER);
                    } else {
                        header.setHorizontalAlignment(SwingConstants.LEFT);
                    }
                    return header;
                }
            });

            setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);

                    if (i1 != 1) {
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
            setModel(model);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = rowAtPoint(e.getPoint());
                    int column = columnAtPoint(e.getPoint());
                    String columnName = getColumnName(column);
                    if (columnName == "Action") {
                        Question question = (Question) getValueAt(row, 1);
                        listener.onDeleteButtonClicked(question);
                    }
                }
            });
            model.addColumn("Select");
            model.addColumn("Question");
            model.addColumn("Action");

            TableColumn selectColumn = getColumnModel().getColumn(0);
            selectColumn.setPreferredWidth(70);
            selectColumn.setResizable(false);

            TableColumn questionColumn = getColumnModel().getColumn(1);
            questionColumn.setPreferredWidth(1400);
            questionColumn.setResizable(false);

            TableColumn actionColumn = getColumnModel().getColumn(2);
            actionColumn.setPreferredWidth(70);
            actionColumn.setResizable(false);

            getColumnModel().getColumn(0).setCellRenderer(new CheckBoxRenderer());

            // Add a table model listener to listen for changes in the table data
            getModel().addTableModelListener((TableModelEvent e) -> {
                if (e.getColumn() == 0) { // Only process changes in the checkbox column
                    int row = e.getFirstRow();
                    boolean selected = (boolean) getModel().getValueAt(row, 0);
                    Question question = (Question) getModel().getValueAt(row, 1);

                    if (selected) {
                        listener.onQuestionSelected(question);
                    } else {
                        listener.onQuestionDeselected(question);
                    }
                }
            });
        } else {
            System.out.println("reload" + ++time);
            getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                    ListQuestionTableHeader header = new ListQuestionTableHeader(o + "");
                    if (i1 == 1) {
                        header.setHorizontalAlignment(SwingConstants.CENTER);
                    } else {
                        header.setHorizontalAlignment(SwingConstants.LEFT);
                    }
                    return header;
                }
            });

            setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);

                    if (i1 == 1) {
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

            DefaultTableModel model = new DefaultTableModel();
            setModel(model);

            model.addColumn("Question");
            model.addColumn("Action");

            TableColumn questionColumn = getColumnModel().getColumn(0);
            questionColumn.setPreferredWidth(1500);
            questionColumn.setResizable(false);

            TableColumn actionColumn = getColumnModel().getColumn(1);
            actionColumn.setPreferredWidth(70);
            actionColumn.setResizable(false);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = rowAtPoint(e.getPoint());
                    int column = columnAtPoint(e.getPoint());
                    System.out.println("row" + row);
                    System.out.println("col" + column);
                    String columnName = getColumnName(column);
                    if (columnName == "Action") {
                        Question question = (Question) getValueAt(row, 0);
                        listener.onDeleteButtonClicked(question);
                    }
                }
            });
        }
        repaint();
    }

    public void setShowCheckbox(boolean status) {
        updateTable(status);
    }

    public void addRow(Question question, Boolean selectMultiple) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        if (selectMultiple) {
            mod.addRow(new Object[]{false, question, "Delete"});
        } else {
            mod.addRow(new Object[]{question, "Delete"});
        }
    }

    public interface ListQuestionEditTableListener {

        void onQuestionSelected(Question question);

        void onQuestionDeselected(Question question);

        void onDeleteButtonClicked(Question question);
    }
}
