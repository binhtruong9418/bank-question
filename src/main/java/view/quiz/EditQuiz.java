/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.quiz;

/**
 *
 * @author Duc Binh
 */
public class EditQuiz extends javax.swing.JPanel {

    public EditQuiz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMenu = new javax.swing.JPopupMenu();
        fromBankQuestionItem = new javax.swing.JMenuItem();
        randomQuestionItem = new javax.swing.JMenuItem();
        quizNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        selectMultipleButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        shuffleCheckbox = new javax.swing.JCheckBox();
        addButtonDropdown = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(fromBankQuestionItem, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.fromBankQuestionItem.text")); // NOI18N
        addMenu.add(fromBankQuestionItem);

        org.openide.awt.Mnemonics.setLocalizedText(randomQuestionItem, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.randomQuestionItem.text")); // NOI18N
        addMenu.add(randomQuestionItem);

        setBackground(new java.awt.Color(255, 255, 255));

        quizNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quizNameLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(quizNameLabel, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.quizNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.jLabel2.text")); // NOI18N

        saveButton.setBackground(new java.awt.Color(7, 116, 163));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(saveButton, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.saveButton.text")); // NOI18N

        selectMultipleButton.setBackground(new java.awt.Color(7, 116, 163));
        selectMultipleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectMultipleButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(selectMultipleButton, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.selectMultipleButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(shuffleCheckbox, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.shuffleCheckbox.text")); // NOI18N

        addButtonDropdown.setBackground(new java.awt.Color(255, 255, 255));
        addButtonDropdown.setForeground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(addButtonDropdown, org.openide.util.NbBundle.getMessage(EditQuiz.class, "EditQuiz.addButtonDropdown.text")); // NOI18N
        addButtonDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonDropdownMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectMultipleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shuffleCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addButtonDropdown)
                                .addGap(26, 26, 26)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quizNameLabel)
                        .addGap(0, 694, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(quizNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMultipleButton)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shuffleCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButtonDropdown)
                .addContainerGap(465, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonDropdownMouseClicked
        // TODO add your handling code here:
        addMenu.show(addButtonDropdown, 0, addButtonDropdown.getHeight());
    }//GEN-LAST:event_addButtonDropdownMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButtonDropdown;
    private javax.swing.JPopupMenu addMenu;
    private javax.swing.JMenuItem fromBankQuestionItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel quizNameLabel;
    private javax.swing.JMenuItem randomQuestionItem;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectMultipleButton;
    private javax.swing.JCheckBox shuffleCheckbox;
    // End of variables declaration//GEN-END:variables
}
