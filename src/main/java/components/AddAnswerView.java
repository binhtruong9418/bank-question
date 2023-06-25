package components;

public class AddAnswerView extends javax.swing.JPanel {

    public AddAnswerView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choiceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        gradeLabel = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.openide.awt.Mnemonics.setLocalizedText(choiceLabel, org.openide.util.NbBundle.getMessage(AddAnswerView.class, "AddAnswerView.choiceLabel.text")); // NOI18N
        choiceLabel.setToolTipText(org.openide.util.NbBundle.getMessage(AddAnswerView.class, "AddAnswerView.choiceLabel.toolTipText")); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer.setColumns(20);
        answer.setRows(5);
        answer.setTabSize(0);
        jScrollPane1.setViewportView(answer);

        org.openide.awt.Mnemonics.setLocalizedText(gradeLabel, org.openide.util.NbBundle.getMessage(AddAnswerView.class, "AddAnswerView.gradeLabel.text")); // NOI18N

        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.33333%", "30%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%" }));
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(choiceLabel)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeActionPerformed

    public String getAnswer() {
        String inputAnswer = answer.getText();
        int index = grade.getSelectedIndex();
        String value = grade.getItemAt(index);
        return inputAnswer + value;
    }
    
    public void setChoiceLabel(String text) {
        choiceLabel.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JLabel choiceLabel;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
