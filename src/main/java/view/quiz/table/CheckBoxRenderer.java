/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.table;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class CheckBoxRenderer extends DefaultTableCellRenderer {

    private final JCheckBox checkBox;

    public CheckBoxRenderer() {
        checkBox = new JCheckBox();
        checkBox.setHorizontalAlignment(SwingConstants.CENTER);
        checkBox.addActionListener((ActionEvent e) -> {
            JCheckBox source = (JCheckBox) e.getSource();
            JTable table = (JTable) source.getParent();
            int row = table.getEditingRow();
            table.getCellEditor(row, 0).stopCellEditing(); // Stop editing the cell to apply the checkbox value
        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Boolean) {
            checkBox.setSelected((boolean) value);
        }
        return checkBox;
    }
}
