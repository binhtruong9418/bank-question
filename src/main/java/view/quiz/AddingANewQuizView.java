package view.quiz;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import model.Quiz;
import repository.quiz.AddNewQuiz;

public class AddingANewQuizView extends javax.swing.JFrame {

    private ListQuizView listQuizView;

    public AddingANewQuizView() {
        initComponents();
        initData();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void setListQuizView(ListQuizView listQuizView) {
        this.listQuizView = listQuizView;
    }

    private void initData() {
        LocalDateTime now = LocalDateTime.now();
        timePickerStart.setDateTimeStrict(now);
        timePickerEnd.setDateTimeStrict(now);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionInput = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        isTimeLimit = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        timeLimitInput = new javax.swing.JTextField();
        timeLimitDropdown = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        timePickerStart = new com.github.lgooddatepicker.components.DateTimePicker();
        timePickerEnd = new com.github.lgooddatepicker.components.DateTimePicker();
        requiredLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quiz.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel1.text_1")); // NOI18N
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel2.text_1")); // NOI18N
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(192, 36, 36));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel3.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel4.text_1")); // NOI18N

        nameInput.setText(org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.nameInput.text_1")); // NOI18N

        descriptionInput.setColumns(20);
        descriptionInput.setRows(5);
        jScrollPane1.setViewportView(descriptionInput);

        org.openide.awt.Mnemonics.setLocalizedText(isTimeLimit, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.isTimeLimit.text_1")); // NOI18N
        isTimeLimit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                isTimeLimitItemStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel5.text_1")); // NOI18N
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(192, 36, 36));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel6.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel7.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel8.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jLabel9.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(submitButton, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.submitButton.text_1")); // NOI18N
        submitButton.setBackground(new java.awt.Color(7, 116, 163));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.cancelButton.text_1")); // NOI18N
        cancelButton.setBackground(new java.awt.Color(192, 36, 36));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open attempts are submitted automatically" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        timeLimitInput.setText(org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.timeLimitInput.text_1")); // NOI18N
        timeLimitInput.setEnabled(isTimeLimit.isSelected());
        timeLimitInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timeLimitInputKeyPressed(evt);
            }
        });

        timeLimitDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "minutes", "seconds", "hours" }));
        timeLimitDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeLimitDropdownActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.jCheckBox2.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel3, org.openide.util.NbBundle.getMessage(AddingANewQuizView.class, "AddingANewQuizView.requiredLabel3.text")); // NOI18N
        requiredLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel3.setForeground(new java.awt.Color(192, 36, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(requiredLabel3))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(306, 306, 306)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timePickerEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timePickerStart, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(submitButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(timeLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(timeLimitDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(isTimeLimit)))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requiredLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(timePickerStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(timePickerEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(timeLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLimitDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isTimeLimit))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void timeLimitDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeLimitDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeLimitDropdownActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        Quiz quiz = new Quiz();

        LocalDateTime selectedDateTimeStart = timePickerStart.getDateTimeStrict();
        long millisecondsStart = selectedDateTimeStart.toInstant(java.time.ZoneOffset.UTC).toEpochMilli();
        quiz.setTimeStart(millisecondsStart);

        LocalDateTime selectedDateTimeEnd = timePickerEnd.getDateTimeStrict();
        long millisecondsEnd = selectedDateTimeEnd.toInstant(java.time.ZoneOffset.UTC).toEpochMilli();
        quiz.setTimeEnd(millisecondsEnd);

        if (isTimeLimit.isSelected()) {
            if (timeLimitInput.getText().isEmpty() || "0".equals(timeLimitInput.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Please input time limit.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int timeLimit = Integer.parseInt(timeLimitInput.getText().trim().replaceAll("[^0-9]", ""));
                String timeType = (String) timeLimitDropdown.getSelectedItem();
                System.out.println(timeType);
                if (timeType == "minutes") {
                    quiz.setTimeLimit(timeLimit * 60);
                } else if (timeType == "hours") {
                    quiz.setTimeLimit(timeLimit * 3600);
                } else if (timeType == "seconds") {
                    quiz.setTimeLimit(timeLimit);
                }
            }
        } else {
            quiz.setTimeLimit(0);
        }
        String name = nameInput.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input name.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            quiz.setName(name);
        }

        String description = descriptionInput.getText();
        quiz.setDescription(description);

        int quizId = new AddNewQuiz().addNewQuiz(quiz);
        if (quizId == -1) {
            JOptionPane.showMessageDialog(null, "Add quiz failed!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Add quiz successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            listQuizView.refreshQuizData();
            this.dispose();
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void timeLimitInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timeLimitInputKeyPressed
        // TODO add your handling code here:
        char keyChar = evt.getKeyChar();
        int keyCode = evt.getKeyCode();

        if (Character.isDigit(keyChar) || keyCode == KeyEvent.VK_BACK_SPACE) {
            timeLimitInput.setEditable(true);
        } else {
            timeLimitInput.setEditable(false);
        }
    }//GEN-LAST:event_timeLimitInputKeyPressed

    private void isTimeLimitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_isTimeLimitItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Checkbox is selected
            timeLimitInput.setEnabled(true);
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            // Checkbox is deselected
            timeLimitInput.setEnabled(false);
        }
    }//GEN-LAST:event_isTimeLimitItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea descriptionInput;
    private javax.swing.JCheckBox isTimeLimit;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel requiredLabel3;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> timeLimitDropdown;
    private javax.swing.JTextField timeLimitInput;
    private com.github.lgooddatepicker.components.DateTimePicker timePickerEnd;
    private com.github.lgooddatepicker.components.DateTimePicker timePickerStart;
    // End of variables declaration//GEN-END:variables
}
