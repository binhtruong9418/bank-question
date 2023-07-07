/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.checkbox;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JCheckBox;

public class SquareCheckBox extends JCheckBox {

    private boolean selected;
    private boolean indeterminate;

    public SquareCheckBox() {
        this.selected = false;
        this.indeterminate = false;

        setPreferredSize(new Dimension(17, 17));
    }

    @Override
    public boolean isSelected() {
        return selected || indeterminate;
    }

    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public void setIndeterminate(boolean indeterminate) {
        this.indeterminate = indeterminate;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Clear the background
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Set the checkbox color
        g2d.setColor(getForeground());

        // Draw the checkbox
        int size = Math.min(getWidth(), getHeight());
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(0, 0, size, size);

        // Fill the checkbox if selected
        if (selected || indeterminate) {
            int margin = size / 4;
            g2d.fillRect(margin, margin, size - margin * 2, size - margin * 2);
        }

        g2d.dispose();
    }
}
