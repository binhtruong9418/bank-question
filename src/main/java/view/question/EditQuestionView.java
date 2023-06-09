package view.question;

import connection.ConnectDB;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.JOptionPane;
import model.Answer;
import model.Category;
import model.Question;
import repository.category.GetAllCategory;
import repository.question.AddNewQuestion;
import repository.question.DeleteQuestion;
import repository.question.EditQuestion;
import service.ArrangeCategory;

public class EditQuestionView extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet rs = null;

    private Question editQuestion;

    private QuestionBank questionBank;

    List<Category> listCategory = new ArrayList<>();
    int currentAnswer = 0;

    public EditQuestionView(Question question) {
        this.editQuestion = question;
        initComponents();
        con = ConnectDB.connect();
        initData();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initData() {
        initDropdownCategoryData();
        System.out.println(editQuestion.getId());
        currentAnswer = editQuestion.getAnswers().size();
        nameInput.setText(editQuestion.getName());
        questionTextInput.setText(editQuestion.getQuestionText());
        markInput.setText(String.valueOf(editQuestion.getMark()));
        int categoryIndex = 0;
        for (int i = 0; i < listCategory.size(); i++) {
            if (listCategory.get(i).getId() == editQuestion.getCategory()) {
                categoryIndex = i;
                break;
            }
        }
        categoryDropdown.setSelectedIndex(categoryIndex);
        currentAnswer = editQuestion.getAnswers().size();
        List<Answer> listAnswer = editQuestion.getAnswers();

        for (int i = 0; i < listAnswer.size(); i++) {
            AddAnswerView answerView = new AddAnswerView();
            answerView.setAnswerText(listAnswer.get(i).getText());
            answerView.setGrade(listAnswer.get(i).getGrade());
            answerView.setChoiceLabel("Choice " + (i + 1));
            if (i != 0) {
                listAnswerView.add(Box.createRigidArea(new Dimension(0, 5)));
            }
            listAnswerView.add(answerView);
        }

        listAnswerView.revalidate();
        listAnswerView.repaint();

        getMoreChoiceButton.setText("BLANKS FOR " + (5 - listAnswer.size()) + " MORE CHOICES");
    }

    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    private void initDropdownCategoryData() {
        // Clear existing items in the dropdown
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
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoryDropdown = new javax.swing.JComboBox<>();
        nameInput = new javax.swing.JTextField();
        markInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTextInput = new javax.swing.JTextArea();
        bottomPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listAnswerView = new javax.swing.JPanel();
        listButton = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        saveChangeButton = new javax.swing.JButton();
        getMoreChoiceButton = new javax.swing.JButton();
        saveChangeAndEditButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        requiredLabel1 = new javax.swing.JLabel();
        requiredLabel2 = new javax.swing.JLabel();
        requiredLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.jLabel6.text")); // NOI18N

        nameInput.setText(org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.nameInput.text")); // NOI18N

        markInput.setEditable(false);
        markInput.setText(org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.markInput.text")); // NOI18N
        markInput.setEnabled(false);
        markInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                markInputKeyPressed(evt);
            }
        });

        questionTextInput.setColumns(20);
        questionTextInput.setRows(5);
        jScrollPane1.setViewportView(questionTextInput);

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setLayout(new java.awt.BorderLayout(0, 20));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listAnswerView.setBackground(new java.awt.Color(255, 255, 255));
        listAnswerView.setLayout(new javax.swing.BoxLayout(listAnswerView, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(listAnswerView);

        bottomPanel.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        listButton.setBackground(new java.awt.Color(255, 255, 255));

        deleteButton.setBackground(new java.awt.Color(192, 36, 36));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(deleteButton, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.deleteButton.text")); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveChangeButton.setBackground(new java.awt.Color(7, 116, 163));
        saveChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(saveChangeButton, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.saveChangeButton.text")); // NOI18N
        saveChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangeButtonActionPerformed(evt);
            }
        });

        getMoreChoiceButton.setBackground(new java.awt.Color(7, 116, 163));
        getMoreChoiceButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(getMoreChoiceButton, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.getMoreChoiceButton.text")); // NOI18N
        getMoreChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMoreChoiceButtonActionPerformed(evt);
            }
        });

        saveChangeAndEditButton.setBackground(new java.awt.Color(7, 116, 163));
        saveChangeAndEditButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(saveChangeAndEditButton, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.saveChangeAndEditButton.text")); // NOI18N
        saveChangeAndEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangeAndEditButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(192, 36, 36));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listButtonLayout = new javax.swing.GroupLayout(listButton);
        listButton.setLayout(listButtonLayout);
        listButtonLayout.setHorizontalGroup(
            listButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listButtonLayout.createSequentialGroup()
                .addGroup(listButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listButtonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveChangeAndEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                    .addGroup(listButtonLayout.createSequentialGroup()
                        .addGroup(listButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listButtonLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(getMoreChoiceButton))
                            .addGroup(listButtonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saveChangeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listButtonLayout.setVerticalGroup(
            listButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listButtonLayout.createSequentialGroup()
                .addComponent(getMoreChoiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveChangeAndEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangeButton)
                    .addComponent(deleteButton)
                    .addComponent(cancelButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bottomPanel.add(listButton, java.awt.BorderLayout.SOUTH);

        requiredLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel1.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel1, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.requiredLabel1.text")); // NOI18N

        requiredLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel2.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel2, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.requiredLabel2.text")); // NOI18N

        requiredLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel3.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel3, org.openide.util.NbBundle.getMessage(EditQuestionView.class, "EditQuestionView.requiredLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(298, 298, 298)
                                .addComponent(categoryDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(263, 263, 263)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(requiredLabel2)
                                    .addComponent(requiredLabel1)
                                    .addComponent(requiredLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(nameInput)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(requiredLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requiredLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(226, 226, 226)
                                .addComponent(jLabel6)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(requiredLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveChangeAndEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangeAndEditButtonActionPerformed
        // TODO add your handling code here:
        try {

            if (nameInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input name.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (questionTextInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input question text.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            List<Answer> listAnswerInput = new ArrayList<>();
            Float totalMark = (float) 0;
            String name = nameInput.getText();
            String questionText = questionTextInput.getText();
            int index = categoryDropdown.getSelectedIndex();
            int category = listCategory.get(index).getId();
            float mark = (float) 1;
            Component[] components = listAnswerView.getComponents();
            for (Component compo : components) {
                if (compo instanceof AddAnswerView) {
                    AddAnswerView addAnswer = (AddAnswerView) compo;
                    Answer answer = addAnswer.getAnswer();
                    if (!answer.getText().isEmpty()) {
                        listAnswerInput.add(answer);
                    }
                    totalMark += answer.getGrade();
                }
            }
            if (totalMark != (float) 100) {
                JOptionPane.showMessageDialog(null, "Total mark is not equal 100%", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Question question = new Question();
            question.setId(editQuestion.getId());
            question.setName(nameInput.getText());
            question.setQuestionText(questionTextInput.getText());
            question.setCategory(category);
            question.setMark(mark);
            question.setAnswers(listAnswerInput);
            EditQuestion editQuestionClass = new EditQuestion();
            editQuestionClass.editQuestion(question);
            JOptionPane.showMessageDialog(null, "Edit Question successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            questionBank.refreshQuestionData();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edit Question failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveChangeAndEditButtonActionPerformed

    private void getMoreChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMoreChoiceButtonActionPerformed
        // TODO add your handling code here:
        addAnswerChoices(5 - currentAnswer);
        getMoreChoiceButton.setVisible(false);
    }//GEN-LAST:event_getMoreChoiceButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you want to delete this question?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DeleteQuestion deleteQuestion = new DeleteQuestion();
                deleteQuestion.deleteQuestion(editQuestion.getId());
                JOptionPane.showMessageDialog(null, "Question deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Additional code after successful deletion
                questionBank.refreshQuestionData();
                questionBank.refreshQuestionCategory();
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Delete Question failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void markInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markInputKeyPressed
        // TODO add your handling code here:
        char keyChar = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (Character.isDigit(keyChar) || keyCode == KeyEvent.VK_BACK_SPACE || keyChar == '.') {
            markInput.setEditable(true);
        } else {
            markInput.setEditable(false);
        }
    }//GEN-LAST:event_markInputKeyPressed

    private void saveChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangeButtonActionPerformed
        // TODO add your handling code here:
        try {

            if (nameInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input name.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (questionTextInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input question text.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (markInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input mark.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            List<Answer> listAnswerInput = new ArrayList<>();
            Float totalMark = (float) 0;
            String name = nameInput.getText();
            String questionText = questionTextInput.getText();
            int index = categoryDropdown.getSelectedIndex();
            int category = listCategory.get(index).getId();
            float mark = Float.parseFloat(markInput.getText());
            Component[] components = listAnswerView.getComponents();
            for (Component compo : components) {
                if (compo instanceof AddAnswerView) {
                    AddAnswerView addAnswer = (AddAnswerView) compo;
                    Answer answer = addAnswer.getAnswer();
                    if (!answer.getText().isEmpty()) {
                        listAnswerInput.add(answer);
                    }
                    totalMark += answer.getGrade();
                }
            }
            if (totalMark != (float) 100) {
                JOptionPane.showMessageDialog(null, "Total mark is not equal 100%", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Question question = new Question();
            question.setId(editQuestion.getId());
            question.setName(nameInput.getText());
            question.setQuestionText(questionTextInput.getText());
            question.setCategory(category);
            question.setMark(mark);
            question.setAnswers(listAnswerInput);
            EditQuestion editQuestion = new EditQuestion();
            editQuestion.editQuestion(question);
            JOptionPane.showMessageDialog(null, "Edit Question successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            questionBank.refreshQuestionData();
            this.dispose();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edit Question failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveChangeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addAnswerChoices(int count) {
        for (int i = currentAnswer; i < count + currentAnswer; i++) {
            AddAnswerView answerView = new AddAnswerView();
            answerView.setChoiceLabel("Choice " + (i + 1));
            if (i != 0) {
                listAnswerView.add(Box.createRigidArea(new Dimension(0, 5)));
            }
            listAnswerView.add(answerView);
        }

        listAnswerView.revalidate();
        listAnswerView.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> categoryDropdown;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton getMoreChoiceButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel listAnswerView;
    private javax.swing.JPanel listButton;
    private javax.swing.JTextField markInput;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextArea questionTextInput;
    private javax.swing.JLabel requiredLabel1;
    private javax.swing.JLabel requiredLabel2;
    private javax.swing.JLabel requiredLabel3;
    private javax.swing.JButton saveChangeAndEditButton;
    private javax.swing.JButton saveChangeButton;
    // End of variables declaration//GEN-END:variables
}
