/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.quiz;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import repository.category.GetAllCategory;
import service.ArrangeCategory;

/**
 *
 * @author Duc Binh
 */
public class AddRandomQuestion extends javax.swing.JFrame {

    private Integer currentCategory = 0;
    private List<Category> listCategory = new ArrayList<>();
    private Boolean showSubCategory = false;

    public AddRandomQuestion() {
        initComponents();
        initDropdownCategoryData();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void refreshQuestionCategory() {
        categoryDropdown.removeAllItems();
        listCategory.clear();
        initDropdownCategoryData();
    }

    private void initDropdownCategoryData() {
        // Clear existing items in the dropdown
        categoryDropdown.removeAllItems();
        listCategory.clear();
        GetAllCategory getAllCategory = new GetAllCategory();
        listCategory = getAllCategory.getAllCategory();

        for (Category category : listCategory) {

            String toString = "";
            String name = category.getName();

            int level = ArrangeCategory.getCategoryLevel(category, listCategory);
            int numSpaces = level * 5; // 5 spaces for each level
            for (int i = 0; i < numSpaces; i++) {
                toString += " ";
            }

            // Add the category name
            toString += name;

            // Add the count if applicable
            if (category.getCount() != 0) {
                toString += " (" + category.getCount() + ")";
            }
            categoryDropdown.addItem(toString); // Add the category to the dropdown
            categoryDropdown.setSelectedIndex(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryDropdown = new javax.swing.JComboBox<>();
        showSubcategoryCheckbox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        numberRandomQuestionInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paginationPane2 = new view.quiz.pagination.PaginationPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.jLabel1.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.jLabel3.text")); // NOI18N

        categoryDropdown.setToolTipText(org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.categoryDropdown.toolTipText")); // NOI18N
        categoryDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDropdownActionPerformed(evt);
            }
        });

        showSubcategoryCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showSubcategoryCheckbox, org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.showSubcategoryCheckbox.text")); // NOI18N
        showSubcategoryCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showSubcategoryCheckboxItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.jLabel2.text")); // NOI18N

        numberRandomQuestionInput.setText(org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.numberRandomQuestionInput.text")); // NOI18N
        numberRandomQuestionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberRandomQuestionInputKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AddRandomQuestion.class, "AddRandomQuestion.jLabel4.text")); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paginationPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(numberRandomQuestionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showSubcategoryCheckbox)
                            .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showSubcategoryCheckbox)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numberRandomQuestionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paginationPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDropdownActionPerformed
        // TODO add your handling code here:
        int index = categoryDropdown.getSelectedIndex();
        if (index == -1) {
            currentCategory = 0;
        } else {
            currentCategory = listCategory.get(index).getId();
        }
    }//GEN-LAST:event_categoryDropdownActionPerformed

    private void showSubcategoryCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showSubcategoryCheckboxItemStateChanged
        // TODO add your handling code here:
        showSubCategory = evt.getStateChange() == ItemEvent.SELECTED;
    }//GEN-LAST:event_showSubcategoryCheckboxItemStateChanged

    private void numberRandomQuestionInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberRandomQuestionInputKeyPressed
        // TODO add your handling code here:
        char keyChar = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (Character.isDigit(keyChar) || keyCode == KeyEvent.VK_BACK_SPACE) {
            numberRandomQuestionInput.setEditable(true);
        } else {
            numberRandomQuestionInput.setEditable(false);
        }
    }//GEN-LAST:event_numberRandomQuestionInputKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> categoryDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numberRandomQuestionInput;
    private view.quiz.pagination.PaginationPane paginationPane2;
    private javax.swing.JCheckBox showSubcategoryCheckbox;
    // End of variables declaration//GEN-END:variables
}