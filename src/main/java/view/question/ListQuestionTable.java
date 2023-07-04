package view.question;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Question;

/**
 *
 * @author Duc Binh
 */
public class ListQuestionTable extends JTable {

    private QuestionBank questionBank;

    public ListQuestionTable() {
        setShowHorizontalLines(true);
        setShowVerticalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(35);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                ListQuestionTableHeader header = new ListQuestionTableHeader(o + "");
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
                if (selected) {
                    com.setBackground(new Color(239, 244, 255));
                } else if (i % 2 == 0) {
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

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = rowAtPoint(e.getPoint());
                int column = columnAtPoint(e.getPoint());
                if (column == 1) {
                    Question question = (Question) getValueAt(row, 0);
                    EditQuestionView editQuestionView = new EditQuestionView(question);
                    editQuestionView.setQuestionBank(questionBank);
                    editQuestionView.setVisible(true);
                }
            }
        });
    }

    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row); // Add the modified rowData to the table model;
    }

}
