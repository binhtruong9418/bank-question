package view.quiz;

import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Question;
import model.Quiz;
import repository.question.AddNewQuestion;
import repository.question.GetAllQuestion;
import repository.quiz.EditQuiz;
import view.quiz.table.ListQuestionEditTable.ListQuestionEditTableListener;
import view.quiz_interface.QuizEditListener;

/**
 *
 * @author Duc Binh
 */
public class EditQuizView extends javax.swing.JPanel implements ListQuestionEditTableListener {
    
    private Boolean selectMultiple = false;
    private Quiz currentQuiz;
    public static List<Question> listQuestion;
    private List<Question> listQuestionSelected = new ArrayList<>();
    private QuizEditListener quizEditListener;
    private Boolean isShuffle;
    
    public EditQuizView() {
        initComponents();
        deleteAllButton.setVisible(false);
        listQuestionEditTable.setShowCheckbox(false);
        listQuestionEditTable.setListQuestionEditTableListener(this);
    }
    
    public void refreshTableData() {
        initListQuestionData();
    }
    
    public void setQuizEditListener(QuizEditListener quizEditListener) {
        this.quizEditListener = quizEditListener;
    }
    
    private void initListQuestionData() {
        DefaultTableModel tableModel = (DefaultTableModel) listQuestionEditTable.getModel();
        tableModel.setRowCount(0);
        
        System.out.println(listQuestion.size());
        
        totalQuestionLabel.setText("Questions: " + listQuestion.size() + " | This quiz is open");
        String formatNumber = new DecimalFormat("0.00").format(listQuestion.size());
        totalMarkLabel.setText("Total of marks: " + formatNumber);
        for (Question question : listQuestion) {
            listQuestionEditTable.addRow(question, selectMultiple);
        }
        
    }
    
    private void setQuizNameLabel(String quizName) {
        quizNameLabel.setText("Editting quiz: " + quizName);
    }
    
    public void setQuiz(Quiz quiz) {
        this.currentQuiz = quiz;
        setQuizNameLabel(quiz.getName());
        listQuestion = new GetAllQuestion().getAllQuestionByQuizId(quiz.getId());
        shuffleCheckbox.setSelected(quiz.getIsShuffle());
        isShuffle = quiz.getIsShuffle();
        initListQuestionData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMenu = new javax.swing.JPopupMenu();
        fromBankQuestionItem = new javax.swing.JMenuItem();
        randomQuestionItem = new javax.swing.JMenuItem();
        quizNameLabel = new javax.swing.JLabel();
        totalQuestionLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        selectMultipleButton = new javax.swing.JButton();
        totalMarkLabel = new javax.swing.JLabel();
        shuffleCheckbox = new javax.swing.JCheckBox();
        addButtonDropdown = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listQuestionEditTable = new view.quiz.table.ListQuestionEditTable();
        deleteAllButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(fromBankQuestionItem, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.fromBankQuestionItem.text")); // NOI18N
        fromBankQuestionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromBankQuestionItemActionPerformed(evt);
            }
        });
        addMenu.add(fromBankQuestionItem);

        org.openide.awt.Mnemonics.setLocalizedText(randomQuestionItem, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.randomQuestionItem.text")); // NOI18N
        randomQuestionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomQuestionItemActionPerformed(evt);
            }
        });
        addMenu.add(randomQuestionItem);

        setBackground(new java.awt.Color(255, 255, 255));

        quizNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quizNameLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(quizNameLabel, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.quizNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(totalQuestionLabel, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.totalQuestionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.jLabel2.text")); // NOI18N

        saveButton.setBackground(new java.awt.Color(0, 159, 229));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(saveButton, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.saveButton.text")); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        selectMultipleButton.setBackground(new java.awt.Color(0, 159, 229));
        selectMultipleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectMultipleButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(selectMultipleButton, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.selectMultipleButton.text")); // NOI18N
        selectMultipleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMultipleButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(totalMarkLabel, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.totalMarkLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(shuffleCheckbox, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.shuffleCheckbox.text")); // NOI18N
        shuffleCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shuffleCheckboxItemStateChanged(evt);
            }
        });

        addButtonDropdown.setBackground(new java.awt.Color(255, 255, 255));
        addButtonDropdown.setForeground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(addButtonDropdown, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.addButtonDropdown.text")); // NOI18N
        addButtonDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonDropdownMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(listQuestionEditTable);

        deleteAllButton.setBackground(new java.awt.Color(192, 36, 36));
        deleteAllButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        deleteAllButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(deleteAllButton, org.openide.util.NbBundle.getMessage(EditQuizView.class, "EditQuizView.deleteAllButton.text")); // NOI18N
        deleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quizNameLabel)
                        .addContainerGap(694, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalQuestionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectMultipleButton)
                            .addComponent(deleteAllButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalMarkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(shuffleCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addButtonDropdown)
                                .addGap(26, 26, 26))))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(quizNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(saveButton))
                    .addComponent(totalQuestionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMultipleButton)
                    .addComponent(totalMarkLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shuffleCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButtonDropdown))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(deleteAllButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonDropdownMouseClicked
        // TODO add your handling code here:
        addMenu.show(addButtonDropdown, 0, addButtonDropdown.getHeight());
    }//GEN-LAST:event_addButtonDropdownMouseClicked

    private void fromBankQuestionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromBankQuestionItemActionPerformed
        // TODO add your handling code here:
        AddQuestionToQuizFromBank addQuestionToQuizFromBank = new AddQuestionToQuizFromBank(listQuestion, this);
        addQuestionToQuizFromBank.setVisible(true);
    }//GEN-LAST:event_fromBankQuestionItemActionPerformed

    private void selectMultipleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMultipleButtonActionPerformed
        // TODO add your handling code here:
        selectMultiple = !selectMultiple;
        if (selectMultiple) {
            deleteAllButton.setVisible(true);
        } else {
            deleteAllButton.setVisible(false);
        }
        listQuestionEditTable.setShowCheckbox(selectMultiple);
        initListQuestionData();
    }//GEN-LAST:event_selectMultipleButtonActionPerformed

    private void randomQuestionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomQuestionItemActionPerformed
        // TODO add your handling code here:
        AddRandomQuestion addRandomQuestion = new AddRandomQuestion(listQuestion, this);
        addRandomQuestion.setVisible(true);
    }//GEN-LAST:event_randomQuestionItemActionPerformed

    private void deleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllButtonActionPerformed
        // TODO add your handling code here:
        listQuestion.removeAll(listQuestionSelected);
        initListQuestionData();
    }//GEN-LAST:event_deleteAllButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save all changes ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int count = new AddNewQuestion().addListQuestionToQuiz(listQuestion, currentQuiz);
                new EditQuiz().editQuiz(currentQuiz.getId(), isShuffle);
                if (count != listQuestion.size()) {
                    JOptionPane.showMessageDialog(null, "Edit quiz failed!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Edit quiz successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    quizEditListener.onSaveEditQuiz();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Edit quiz failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void shuffleCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shuffleCheckboxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Checkbox is selected
            isShuffle = true;
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            // Checkbox is deselected
            isShuffle = false;
        }
    }//GEN-LAST:event_shuffleCheckboxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButtonDropdown;
    private javax.swing.JPopupMenu addMenu;
    private javax.swing.JButton deleteAllButton;
    private javax.swing.JMenuItem fromBankQuestionItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private view.quiz.table.ListQuestionEditTable listQuestionEditTable;
    private javax.swing.JLabel quizNameLabel;
    private javax.swing.JMenuItem randomQuestionItem;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectMultipleButton;
    private javax.swing.JCheckBox shuffleCheckbox;
    private javax.swing.JLabel totalMarkLabel;
    private javax.swing.JLabel totalQuestionLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onQuestionSelected(Question question) {
        System.out.println("check");
        listQuestionSelected.add(question);
    }
    
    @Override
    public void onQuestionDeselected(Question question) {
        System.out.println("uncheck");
        listQuestionSelected.remove(question);
    }
    
    @Override
    public void onDeleteButtonClicked(Question deleteQuestion) {
        listQuestion.remove(deleteQuestion);
        initListQuestionData();
    }
    
}
