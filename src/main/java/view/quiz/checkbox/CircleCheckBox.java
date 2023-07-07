/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.checkbox;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JCheckBox;

public class CircleCheckBox extends JCheckBox {

    private boolean selected;

    public CircleCheckBox() {
        this.selected = false;
        setPreferredSize(new Dimension(17, 17));
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
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
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, size, size);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(circle);

        // Fill the checkbox if selected
        if (selected) {
            int margin = size / 4;
            Ellipse2D.Double innerCircle = new Ellipse2D.Double(margin, margin, size - margin * 2, size - margin * 2);
            g2d.fill(innerCircle);
        }

        g2d.dispose();
    }
}
