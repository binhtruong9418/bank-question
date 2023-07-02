/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import model.Quiz;

public class QuizItem extends JLabel implements ListCellRenderer<Quiz> {

    public QuizItem() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/quiz.png"));
        setIcon(imageIcon);
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Quiz> list, Quiz value, int index,
            boolean isSelected, boolean cellHasFocus) {
        // Set the text of the label to the quiz name
        setText(value.getName());
        setBackground(Color.WHITE);
        setFont(getFont().deriveFont(18f));
        setBorder(new EmptyBorder(10, 20, 10, 20));
        return this;
    }
}
