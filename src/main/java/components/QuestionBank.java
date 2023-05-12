/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectDB;
import model.Answer;
import model.Question;

/**
 *
 * @author Duc Binh
 */
public class QuestionBank extends javax.swing.JPanel {


    /**
     * Creates new form ListQuestion
     */
    public QuestionBank() {
        initComponents();
        initListQuestionsTableData();
    }
    
    public void initListQuestionsTableData()  {
        Connection con = ConnectDB.connect();

        String sql = "SELECT * FROM questions";
        System.out.println("initListQuestionsTableData");
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                String questionText = rs.getString("question_text");
                String answerA = rs.getString("answer1_text");
                String answerB = rs.getString("answer2_text");
                String answerC = rs.getString("answer3_text");
                String answerD = rs.getString("answer4_text");
                String answerE = rs.getString("answer5_text");
                String toString = "" + questionText;
                if(answerA != null) {
                    toString = toString + " " + answerA;
                }
                if(answerB != null) {
                    toString = toString + " " + answerB;
                }
                if(answerC != null) {
                    toString = toString + " " + answerC;
                }
                if(answerD != null) {
                    toString = toString + " " + answerD;
                }
                if(answerE != null) {
                    toString = toString + " " + answerE;
                }
                System.out.println("a question: " + toString);
            }

            for (int i = 0; i < Question.listQuestion.size(); i++) {
                Question question = Question.listQuestion.get(i);
                listQuestionTable.addRow(question.toRowTable());
            }


//            for(int i=0; i < 15; i++) {
//                Question question = new Question();
//                question.setQuestionText("this is a question");
//                List<Answer> listAnswer = new ArrayList<>();
//                listAnswer.add(new Answer("A. Answer A"));
//                listAnswer.add(new Answer("B. Answer B"));
//                listAnswer.add(new Answer("C. Answer C"));
//                listAnswer.add(new Answer("D. Answer D"));
//                question.setAnswers(listAnswer);
////            Question.listQuestion.add(question);
////            Question question = Question.listQuestion.get(i);
//                listQuestionTable.addRow(question.toRowTable());
//            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listQuestionTitleLabel = new javax.swing.JLabel();
        selectCategoryLabel = new javax.swing.JLabel();
        selectCategoryDropdown = new javax.swing.JComboBox<>();
        categoryDescriptionLabel = new javax.swing.JLabel();
        showSubcategoryCheckbox = new javax.swing.JCheckBox();
        createNewQuestionButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listQuestionTable = new components.ListQuestionTable();

        setBackground(new java.awt.Color(255, 255, 255));

        listQuestionTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        listQuestionTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(listQuestionTitleLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.listQuestionTitleLabel.text")); // NOI18N

        selectCategoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(selectCategoryLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.selectCategoryLabel.text")); // NOI18N

        selectCategoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        categoryDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(categoryDescriptionLabel, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.categoryDescriptionLabel.text")); // NOI18N
        categoryDescriptionLabel.setToolTipText(org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.categoryDescriptionLabel.toolTipText")); // NOI18N

        showSubcategoryCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showSubcategoryCheckbox, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.showSubcategoryCheckbox.text")); // NOI18N

        createNewQuestionButton.setBackground(new java.awt.Color(7, 116, 163));
        createNewQuestionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createNewQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(createNewQuestionButton, org.openide.util.NbBundle.getMessage(QuestionBank.class, "QuestionBank.createNewQuestionButton.text")); // NOI18N

        jScrollPane3.setBorder(null);

        listQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listQuestionTable);
        if (listQuestionTable.getColumnModel().getColumnCount() > 0) {
            listQuestionTable.getColumnModel().getColumn(0).setPreferredWidth(1800);
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
                    .addComponent(jScrollPane3)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryDescriptionLabel;
    private javax.swing.JButton createNewQuestionButton;
    private javax.swing.JScrollPane jScrollPane3;
    private components.ListQuestionTable listQuestionTable;
    private javax.swing.JLabel listQuestionTitleLabel;
    private javax.swing.JComboBox<String> selectCategoryDropdown;
    private javax.swing.JLabel selectCategoryLabel;
    private javax.swing.JCheckBox showSubcategoryCheckbox;
    // End of variables declaration//GEN-END:variables
}
