/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duc Binh
 */
public class ListQuestionTable extends JTable{
    
    public ListQuestionTable() {
    setShowHorizontalLines(true);
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
                if(i1 == 1) {
                    com.setForeground(new Color(7,116,163));
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                setBorder(noFocusBorder);
                if (selected) {
                    com.setBackground(new Color(239, 244, 255));
                } else {
                    com.setBackground(Color.WHITE);
                }
                return com;
            }
        });
    }
    
    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }
    
}
