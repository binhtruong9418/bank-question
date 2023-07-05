/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.quiz.pagination;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PaginationPane extends JPanel {

    private int currentPage;
    private int totalPages;
    private final JButton prevButton;
    private final JButton nextButton;
    private final JButton moreButton;
    private final JButton lessButton;
    private int countTenPage;
    private JButton[] pageButtons;

    public PaginationPane() {
        currentPage = 1;
        totalPages = 50; // Assuming there are 10 pages for this example
        countTenPage = 0;

        prevButton = new JButton(new ImageIcon(getClass().getResource("/images/left-arrow.png")));
        nextButton = new JButton(new ImageIcon(getClass().getResource("/images/right-arrow.png")));
        moreButton = new JButton("...");
        lessButton = new JButton("...");

        setLayout(new FlowLayout());
        updateButtonState();
        
        

        prevButton.addActionListener((ActionEvent e) -> {
            if (currentPage > 1) {
                currentPage--;
                updateButtonState();
            }
        });

        nextButton.addActionListener((ActionEvent e) -> {
            if (currentPage < totalPages) {
                currentPage++;
                updateButtonState();
            }
        });

        moreButton.addActionListener((ActionEvent e) -> {
            countTenPage++;
            updateButtonState();
        });

        lessButton.addActionListener((ActionEvent e) -> {
            countTenPage--;
            updateButtonState();
        });

    }

    private final void updateButtonState() {
        removeAll();
        add(prevButton);
        if (countTenPage != 0) {
            add(lessButton);
        }
        int startPage = countTenPage * 10 + 1;
        int endPage = Math.min(countTenPage * 10 + 10, totalPages);
        for (int i = startPage; i <= endPage; i++) {
            JButton button = new JButton();
            button.setText(Integer.toString(i));
            add(button);
        }
        if (countTenPage * 10 + 10 < totalPages) {
            add(moreButton);
        }
        add(nextButton);
        prevButton.setEnabled(currentPage > 1);
        nextButton.setEnabled(currentPage < totalPages);
    }
}
