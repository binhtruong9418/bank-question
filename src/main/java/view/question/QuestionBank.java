package view.question;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectDB;
import service.ArrangeCategory;
import java.awt.event.ItemEvent;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Question;
import repository.category.GetAllCategory;
import repository.question.GetAllQuestion;

/**
 *
 * @author Duc Binh
 */
public class QuestionBank extends javax.swing.JPanel {

    Connection con = null;
    public Integer currentCategory = 0;
    List<Category> listCategory = new ArrayList<>();

    Boolean showSubCategory = false;

    /**
     * Creates new form ListQuestion
     */
    public QuestionBank() {
        initComponents();
        con = ConnectDB.connect();
        initDropdownCategoryData();
        listQuestionTable.setQuestionBank(this);
    }

    public void refreshQuestionData() {
        DefaultTableModel tableModel = (DefaultTableModel) listQuestionTable.getModel();
        tableModel.setRowCount(0);
        initListQuestionsTableData();
    }

    public void refreshQuestionCategory() {
        selectCategoryDropdown.removeAllItems();
        listCategory.clear();
        initDropdownCategoryData();
    }

    private void initDropdownCategoryData() {

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
            selectCategoryDropdown.addItem(toString); // Add the category to the dropdown
            selectCategoryDropdown.setSelectedIndex(0);
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
            listQuestionTable.addRow(question.toRowTable());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listQuestionTitleLabel = new javax.swing.JLabel();
        selectCategoryLabel = new javax.swing.JLabel();
        selectCategoryDropdown = new javax.swing.JComboBox<>();
        categoryDescriptionLabel = new javax.swing.JLabel();
        showSubcategoryCheckbox = new javax.swing.JCheckBox();
        createNewQuestionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listQuestionTable = new view.question.ListQuestionTable();

        setBackground(new java.awt.Color(255, 255, 255));

        listQuestionTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        listQuestionTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(listQuestionTitleLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.listQuestionTitleLabel.text")); // NOI18N

        selectCategoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(selectCategoryLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.selectCategoryLabel.text")); // NOI18N

        selectCategoryDropdown.setToolTipText(org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.selectCategoryDropdown.toolTipText")); // NOI18N
        selectCategoryDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoryDropdownActionPerformed(evt);
            }
        });

        categoryDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(categoryDescriptionLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.categoryDescriptionLabel.text")); // NOI18N
        categoryDescriptionLabel.setToolTipText(org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.categoryDescriptionLabel.toolTipText")); // NOI18N

        showSubcategoryCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showSubcategoryCheckbox, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.showSubcategoryCheckbox.text")); // NOI18N
        showSubcategoryCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showSubcategoryCheckboxItemStateChanged(evt);
            }
        });

        createNewQuestionButton.setBackground(new java.awt.Color(0, 159, 229));
        createNewQuestionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createNewQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(createNewQuestionButton, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.createNewQuestionButton.text")); // NOI18N
        createNewQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewQuestionButtonActionPerformed(evt);
            }
        });

        listQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Questions", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listQuestionTable);
        if (listQuestionTable.getColumnModel().getColumnCount() > 0) {
            listQuestionTable.getColumnModel().getColumn(0).setPreferredWidth(1700);
            listQuestionTable.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.listQuestionTable.columnModel.title0")); // NOI18N
            listQuestionTable.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.listQuestionTable.columnModel.title1")); // NOI18N
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createNewQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showSubcategoryCheckbox)
                            .addComponent(categoryDescriptionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectCategoryLabel)
                                .addGap(36, 36, 36)
                                .addComponent(selectCategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listQuestionTitleLabel))
                        .addContainerGap(635, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(listQuestionTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCategoryLabel)
                    .addComponent(selectCategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showSubcategoryCheckbox)
                .addGap(18, 18, 18)
                .addComponent(createNewQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createNewQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewQuestionButtonActionPerformed
        AddQuestionView addquestionview = new AddQuestionView();
        addquestionview.setQuestionBank(this);
        addquestionview.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_createNewQuestionButtonActionPerformed

    private void selectCategoryDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoryDropdownActionPerformed
        // TODO add your handling code here:
        int index = selectCategoryDropdown.getSelectedIndex();
        if (index == -1) {
            currentCategory = 0;
        } else {
            currentCategory = listCategory.get(index).getId();
        }
        refreshQuestionData();
    }//GEN-LAST:event_selectCategoryDropdownActionPerformed

    private void showSubcategoryCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showSubcategoryCheckboxItemStateChanged
        // TODO add your handling code here:
        showSubCategory = evt.getStateChange() == ItemEvent.SELECTED;
        refreshQuestionData();
    }//GEN-LAST:event_showSubcategoryCheckboxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryDescriptionLabel;
    private javax.swing.JButton createNewQuestionButton;
    private javax.swing.JScrollPane jScrollPane1;
    private view.question.ListQuestionTable listQuestionTable;
    private javax.swing.JLabel listQuestionTitleLabel;
    private javax.swing.JComboBox<String> selectCategoryDropdown;
    private javax.swing.JLabel selectCategoryLabel;
    private javax.swing.JCheckBox showSubcategoryCheckbox;
    // End of variables declaration//GEN-END:variables
}
