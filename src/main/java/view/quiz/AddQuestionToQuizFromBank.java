/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.quiz;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Question;
import repository.category.GetAllCategory;
import repository.question.GetAllQuestion;
import service.ArrangeCategory;

/**
 *
 * @author Duc Binh
 */
public class AddQuestionToQuizFromBank extends javax.swing.JFrame {

    private Boolean showSubCategory = false;
    List<Category> listCategory = new ArrayList<>();
    public Integer currentCategory = 0;

    public AddQuestionToQuizFromBank() {
        initComponents();
        initDropdownCategoryData();

        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void refreshQuestionData() {
        DefaultTableModel tableModel = (DefaultTableModel) listQuestionSelectableTable.getModel();
        tableModel.setRowCount(0);
        initListQuestionsTableData();
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

    private void initListQuestionsTableData() {
        GetAllQuestion getAllQuestion = new GetAllQuestion();
        List<Question> listQuestion = new ArrayList<>();
        if (!showSubCategory) {
            listQuestion.addAll(getAllQuestion.getAllQuestionByCategoryId(currentCategory));
        } else {
            List<Integer> listSubCategory = ArrangeCategory.getListCategoryChildren(currentCategory, listCategory);
            listSubCategory.add(currentCategory);
            listQuestion.addAll(getAllQuestion.getAllQuestionByListCategoryId(listSubCategory));
        }
        for (Question question : listQuestion) {
            listQuestionSelectableTable.addRow(question);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryDropdown = new javax.swing.JComboBox<>();
        showSubcategoryCheckbox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listQuestionSelectableTable = new view.quiz.table.ListQuestionSelectableTable();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddQuestionToQuizFromBank.class, "AddQuestionToQuizFromBank.jLabel1.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddQuestionToQuizFromBank.class, "AddQuestionToQuizFromBank.jLabel3.text")); // NOI18N

        categoryDropdown.setToolTipText(org.openide.util.NbBundle.getMessage(AddQuestionToQuizFromBank.class, "AddQuestionToQuizFromBank.categoryDropdown.toolTipText")); // NOI18N
        categoryDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDropdownActionPerformed(evt);
            }
        });

        showSubcategoryCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showSubcategoryCheckbox, org.openide.util.NbBundle.getMessage(AddQuestionToQuizFromBank.class, "AddQuestionToQuizFromBank.showSubcategoryCheckbox.text")); // NOI18N
        showSubcategoryCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showSubcategoryCheckboxItemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(listQuestionSelectableTable);

        submitButton.setBackground(new java.awt.Color(7, 116, 163));
        submitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(submitButton, org.openide.util.NbBundle.getMessage(AddQuestionToQuizFromBank.class, "AddQuestionToQuizFromBank.submitButton.text")); // NOI18N
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showSubcategoryCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                                .addComponent(submitButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(57, 57, 57)
                                    .addComponent(categoryDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showSubcategoryCheckbox)
                    .addComponent(submitButton))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showSubcategoryCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showSubcategoryCheckboxItemStateChanged
        // TODO add your handling code here:
        showSubCategory = evt.getStateChange() == ItemEvent.SELECTED;
        refreshQuestionData();
    }//GEN-LAST:event_showSubcategoryCheckboxItemStateChanged

    private void categoryDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDropdownActionPerformed
        // TODO add your handling code here:
        int index = categoryDropdown.getSelectedIndex();
        if (index == -1) {
            currentCategory = 0;
        } else {
            currentCategory = listCategory.get(index).getId();
        }
        refreshQuestionData();
    }//GEN-LAST:event_categoryDropdownActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        List<Question> listData = listQuestionSelectableTable.getSelectedQuestions();
        for (Question question : listData) {
            System.out.println(question.getName());
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private view.quiz.table.ListQuestionSelectableTable listQuestionSelectableTable;
    private javax.swing.JCheckBox showSubcategoryCheckbox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
