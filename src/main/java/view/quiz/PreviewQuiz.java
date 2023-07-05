package view.quiz;

import model.Quiz;
import view.quiz_interface.PreviewQuizButtonListener;

public class PreviewQuiz extends javax.swing.JPanel {

    private Quiz currentQuiz;
    private PreviewQuizButtonListener listener;

    public PreviewQuiz() {
        initComponents();
    }

    public void setButtonClickListener(PreviewQuizButtonListener listener) {
        this.listener = listener;
    }
    
    public void setQuiz(Quiz quiz) {
        currentQuiz = quiz;
        setQuizNameLabel(quiz.getName());
        setTimeLimit(quiz.getTimeLimit());
    }

    private void setQuizNameLabel(String quizName) {
        quizNameLabel.setText(quizName);
    }

    private void setTimeLimit(int timeLimit) {
        if (timeLimit == 0) {
            timeLimitLabel.setText("Time limit: Unlimited");
        } else {
            String time = convertToHourTime(timeLimit);
            timeLimitLabel.setText("Time limit: " + time);
        }
    }

    private static String convertToHourTime(int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        if (remainingMinutes == 0) {
            return hours + "h";
        }
        if(hours == 0) {
            return remainingMinutes + "m";
        }
        return hours + "h " + remainingMinutes + "m";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        settingButton = new javax.swing.JButton();
        timeLimitLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quizNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        previewQuizButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel4.text")); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(title, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.title.text")); // NOI18N

        settingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(settingButton, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.settingButton.text")); // NOI18N
        settingButton.setBorder(null);
        settingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingButtonActionPerformed(evt);
            }
        });

        timeLimitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(timeLimitLabel, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.timeLimitLabel.text")); // NOI18N
        timeLimitLabel.setToolTipText(org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.timeLimitLabel.toolTipText")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel3.text")); // NOI18N

        quizNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quizNameLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(quizNameLabel, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.quizNameLabel.text")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(7, 116, 163));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel5)
                .addGap(309, 309, 309)
                .addComponent(jLabel6)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel1)
                .addGap(304, 304, 304)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        previewQuizButton.setBackground(new java.awt.Color(7, 116, 163));
        previewQuizButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        previewQuizButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(previewQuizButton, org.openide.util.NbBundle.getMessage(PreviewQuiz.class, "PreviewQuiz.previewQuizButton.text")); // NOI18N
        previewQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewQuizButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(quizNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(settingButton)))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(previewQuizButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addComponent(timeLimitLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingButton)
                    .addComponent(quizNameLabel))
                .addGap(3, 3, 3)
                .addComponent(timeLimitLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(previewQuizButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingButtonActionPerformed
        // TODO add your handling code here:
        listener.onSettingButtonClick(currentQuiz);
    }//GEN-LAST:event_settingButtonActionPerformed

    private void previewQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewQuizButtonActionPerformed
        // TODO add your handling code here:
        listener.onPreviewButtonClick(currentQuiz);    
    }//GEN-LAST:event_previewQuizButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton previewQuizButton;
    private javax.swing.JLabel quizNameLabel;
    private javax.swing.JButton settingButton;
    private javax.swing.JLabel timeLimitLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
