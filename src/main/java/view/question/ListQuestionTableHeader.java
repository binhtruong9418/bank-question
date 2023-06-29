/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.question;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Duc Binh
 */
public class ListQuestionTableHeader extends JLabel{
    
    public ListQuestionTableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("S", 1, 14));
        setForeground(new Color(102, 102, 102));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(230, 230, 230));
        g2.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
    
}
