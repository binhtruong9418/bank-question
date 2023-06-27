package components;

import function.ArrangeCategory;
import connection.ConnectDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Category;
import org.openide.util.Exceptions;

/**
 *
 * @author Duc Binh
 */
public class AddCategory extends javax.swing.JPanel {

    private QuestionBank questionBank;
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet rs = null;

    List<Category> listCategory = new ArrayList<>();

    public AddCategory() {
        initComponents();
        con = ConnectDB.connect();
        initDropdownCategoryData();
    }

    public void getQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    private void initDropdownCategoryData() {
        // Clear existing items in the dropdown
        parentCategoryInput.removeAllItems();
        String sql = "SELECT * FROM categories";
        try {
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            // Clear the existing category data
            listCategory.clear();
            while (rs.next()) {
                int id = rs.getInt("category_id");
                String categoryName = rs.getString("category_name");
                int countQuestion = rs.getInt("category_count_question");
                Integer parentCategory = (Integer) rs.getObject("category_parent");
                if (parentCategory == null) {
                    parentCategory = -1;
                }
                Category category = new Category();
                category.setId(id);
                category.setCount(countQuestion);
                category.setName(categoryName);
                category.setParentCategory(parentCategory);
                listCategory.add(category); // Add the updated category to the list

            }
            listCategory = ArrangeCategory.arrangeCategories(listCategory);
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
                parentCategoryInput.addItem(toString); // Add the category to the dropdown
            }
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCategoryTitleLabel = new javax.swing.JLabel();
        parentCategoryInputLabel = new javax.swing.JLabel();
        parentCategoryInput = new javax.swing.JComboBox<>();
        nameCategoryInputLabel = new javax.swing.JLabel();
        nameCategoryInput = new javax.swing.JTextField();
        requiredLabel1 = new javax.swing.JLabel();
        categoryInfoInputLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryInfoInput = new javax.swing.JTextArea();
        IDNumberInputLabel = new javax.swing.JLabel();
        IDNumberInput = new javax.swing.JTextField();
        addCategoryButtonSubmit = new javax.swing.JButton();
        requiredText = new javax.swing.JLabel();
        requiredLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        addCategoryTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addCategoryTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(addCategoryTitleLabel, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.addCategoryTitleLabel.text")); // NOI18N

        parentCategoryInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(parentCategoryInputLabel, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.parentCategoryInputLabel.text")); // NOI18N

        parentCategoryInput.setToolTipText(org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.parentCategoryInput.toolTipText")); // NOI18N
        parentCategoryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentCategoryInputActionPerformed(evt);
            }
        });

        nameCategoryInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(nameCategoryInputLabel, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.nameCategoryInputLabel.text")); // NOI18N

        nameCategoryInput.setText(org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.nameCategoryInput.text")); // NOI18N

        requiredLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel1.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel1, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.requiredLabel1.text")); // NOI18N

        categoryInfoInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(categoryInfoInputLabel, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.categoryInfoInputLabel.text")); // NOI18N

        categoryInfoInput.setColumns(20);
        categoryInfoInput.setRows(5);
        jScrollPane1.setViewportView(categoryInfoInput);

        IDNumberInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(IDNumberInputLabel, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.IDNumberInputLabel.text")); // NOI18N

        IDNumberInput.setText(org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.IDNumberInput.text")); // NOI18N
        IDNumberInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDNumberInputKeyPressed(evt);
            }
        });

        addCategoryButtonSubmit.setBackground(new java.awt.Color(192, 36, 36));
        addCategoryButtonSubmit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addCategoryButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(addCategoryButtonSubmit, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.addCategoryButtonSubmit.text")); // NOI18N
        addCategoryButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryButtonSubmitActionPerformed(evt);
            }
        });

        requiredText.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(requiredText, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.requiredText.text")); // NOI18N
        requiredText.setToolTipText(org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.requiredText.toolTipText")); // NOI18N
        requiredText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        requiredLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel2.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel2, org.openide.util.NbBundle.getMessage(AddCategory.class, "AddCategory.requiredLabel2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(IDNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(requiredText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requiredLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(addCategoryButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(parentCategoryInputLabel)
                                            .addGap(144, 144, 144))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nameCategoryInputLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(requiredLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDNumberInputLabel)
                                            .addComponent(categoryInfoInputLabel)
                                            .addComponent(addCategoryTitleLabel))
                                        .addGap(115, 115, 115)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(parentCategoryInput, 0, 251, Short.MAX_VALUE)
                                    .addComponent(nameCategoryInput))))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addCategoryTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentCategoryInputLabel)
                    .addComponent(parentCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCategoryInputLabel)
                    .addComponent(nameCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requiredLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryInfoInputLabel)
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDNumberInputLabel)
                            .addComponent(IDNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCategoryButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(requiredText))
                    .addComponent(requiredLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void parentCategoryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentCategoryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentCategoryInputActionPerformed

    private void addCategoryButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryButtonSubmitActionPerformed
        // TODO add your handling code here:
        int index = parentCategoryInput.getSelectedIndex();
        int parentCategory;
        if (index == -1) {
            parentCategory = 0;
        } else {
            parentCategory = listCategory.get(index).getId();
        }
        String name = nameCategoryInput.getText();
        String info = categoryInfoInput.getText();
        int idNumber = -1;
        System.out.println("name: " + name);
        System.out.println("info: " + info);
        System.out.println("parentCategory: " + parentCategory);
        System.out.println("idNumber: " + idNumber);

        String sql = "INSERT INTO categories (category_name,category_parent,category_info,category_id_number,category_count_question) VALUES (?,?,?,?,0)";
        try {
            pre = con.prepareStatement(sql);
            pre.setString(1, name);
            if (parentCategory == 0) {
                pre.setNull(2, NULL);
            } else {
                pre.setInt(2, parentCategory);
            }
            if (info.isEmpty()) {
                pre.setNull(3, NULL);
            } else {
                pre.setString(3, info);
            }
            if (idNumber == -1) {
                pre.setNull(4, NULL);
            } else {
                pre.setInt(4, Integer.parseInt(IDNumberInput.getText()));
            }
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add category successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            initDropdownCategoryData();
            nameCategoryInput.setText("");
            categoryInfoInput.setText("");
            IDNumberInput.setText("");
            questionBank.refreshQuestionsTable();
        } catch (SQLException ex) {
            System.out.println("Error adding category to the database: " + ex.getMessage());
        }
    }//GEN-LAST:event_addCategoryButtonSubmitActionPerformed

    private void IDNumberInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDNumberInputKeyPressed
        // TODO add your handling code here:
        char keyChar = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (Character.isDigit(keyChar) || keyCode == KeyEvent.VK_BACK_SPACE) {
            IDNumberInput.setEditable(true);
        } else {
            IDNumberInput.setEditable(false);
        }
    }//GEN-LAST:event_IDNumberInputKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDNumberInput;
    private javax.swing.JLabel IDNumberInputLabel;
    private javax.swing.JButton addCategoryButtonSubmit;
    private javax.swing.JLabel addCategoryTitleLabel;
    private javax.swing.JTextArea categoryInfoInput;
    private javax.swing.JLabel categoryInfoInputLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameCategoryInput;
    private javax.swing.JLabel nameCategoryInputLabel;
    private javax.swing.JComboBox<String> parentCategoryInput;
    private javax.swing.JLabel parentCategoryInputLabel;
    private javax.swing.JLabel requiredLabel1;
    private javax.swing.JLabel requiredLabel2;
    private javax.swing.JLabel requiredText;
    // End of variables declaration//GEN-END:variables
}
