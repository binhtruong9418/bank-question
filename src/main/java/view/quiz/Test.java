package view.quiz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import model.Answer;
import model.Question;
import model.Quiz;
import repository.question.GetAllQuestion;
import view.quiz_interface.PreviewQuizButtonListener;

public class Test extends javax.swing.JFrame {

    private final Quiz currentQuiz;
    private Boolean isFinish;
    private List<Question> listQuestion;
    private LocalDateTime startQuiz;
    private LocalDateTime endQuiz;
    private PreviewQuizButtonListener listener;

    private Timer timer;

    private void runtime() {
        timer = new Timer(1000, new ActionListener() {
            int totalTime = currentQuiz.getTimeLimit(); // Total time in seconds (example: 4000 seconds = 1 hour, 6 minutes, 40 seconds)

            @Override
            public void actionPerformed(ActionEvent e) {
                if (totalTime > 0) {
                    totalTime--;

                    int hours = totalTime / 3600;
                    int minutes = (totalTime % 3600) / 60;
                    int seconds = (totalTime % 3600) % 60;

                    String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

                    timeLeft.setText("Time left: " + formattedTime);
                } else {
                    timer.stop();
                    if (!isFinish) {
                        submitQuiz();
                    }
                    // Timer has finished, perform any necessary actions here
                }
            }
        });

        timer.start();
    }

    public Test(Quiz quiz) {
        this.isFinish = false;
        this.currentQuiz = quiz;
        startQuiz = LocalDateTime.now();
        initComponents();
        resultDisplayPanel.setVisible(false);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // Perform any necessary cleanup or actions before closing
                    closeQuiz();
                }
            }
        });
        setLocationRelativeTo(null);
        addData();
        addNumber();
        runtime();
    }

    private void closeQuiz() {
        this.dispose();
    }

    private void addData() {
        listQuestion = new GetAllQuestion().getAllQuestionByQuizId(currentQuiz.getId());
        if (currentQuiz.getIsShuffle()) {
            Collections.shuffle(listQuestion);
        }
        for (int i = 0; i < listQuestion.size(); i++) {
            QuizQuestionView quizQuestion = new QuizQuestionView(listQuestion.get(i));
            quizQuestion.setchoicequestion("Question " + (i + 1));
            listQuestionPanel.add(quizQuestion);
        }

        listQuestionPanel.revalidate();
        listQuestionPanel.repaint();
    }

    private void addNumber() {
        int number = listQuestion.size();
        JPanel numberQuestion = new JPanel(new GridLayout());
        for (int i = 1; i <= number; i++) {
            Number number1 = new Number();
            number1.setnumber(Integer.toString(i));
            numberQuestion.add(number1);
        }
        int column = 7;
        int row = number / 7;
        if (number % 7 != 0) {
            row++;
        }
        pageNavigation.add(numberQuestion, BorderLayout.CENTER);
        GridLayout layout = (GridLayout) numberQuestion.getLayout();

        // Set the row and column indices for the component
        layout.setColumns(column);
        layout.setRows(row);

        pageNavigation.revalidate();

    }

    private void submitQuiz() {
        endQuiz = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, h:mm a");

        String startQuizTimeFormatted = startQuiz.format(formatter);
        String endQuizTimeFormatted = endQuiz.format(formatter);

        Duration duration = Duration.between(startQuiz, endQuiz);
        long hours = duration.toHours();
        long minutes = (duration.toMinutes() % 60);
        long seconds = (duration.getSeconds() % 60);
        StringBuilder durationString = new StringBuilder("");

        if (hours > 0) {
            String hoursString = (hours == 1) ? "hr" : "hrs";
            durationString.append(" ").append(hours).append(" ").append(hoursString);
        }

        if (minutes > 0) {
            String minutesString = (minutes == 1) ? "min" : "mins";
            durationString.append(" ").append(minutes).append(" ").append(minutesString);
        }

        String secondsString = (seconds == 1) ? "sec" : "secs";
        durationString.append(" ").append(seconds).append(" ").append(secondsString);
        resultDisplayPanel.setVisible(true);
        timer.stop();
        float totalMark = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float totalGrade = 0;
        Component[] components = listQuestionPanel.getComponents();
        int index = 0;
        for (Component compo : components) {
            if (compo instanceof QuizQuestionView) {
                QuizQuestionView quizQuestionView = (QuizQuestionView) compo;
                quizQuestionView.onFinishQuiz();
                List<Answer> listAnswer = quizQuestionView.getSelectedAnswer();
                for (Answer answer : listAnswer) {
                    float mark = answer.getGrade() / 100;
                    totalMark += mark;
                }
            }
            index++; // Increment the index after each iteration
        }
        String fullTotalMark = decimalFormat.format((float) listQuestion.size());
        String myMark = decimalFormat.format(totalMark);
        markLabel.setText(myMark + "/" + fullTotalMark);
        startQuizLabel.setText(startQuizTimeFormatted);
        endQuizLabel.setText(endQuizTimeFormatted);
        timeTakenLabel.setText(durationString.toString().trim());
        float myGrade = ((float) 10 / listQuestion.size()) * totalMark;
        float myGradePercent = totalMark / ((float) listQuestion.size() / 100);
        gradeLabel.setText(decimalFormat.format(myGrade) + " out of 10.00 (" + new DecimalFormat("0").format(myGradePercent) + "%)");
        finishQuiz.setText("Finish review");
        isFinish = true;
    }

    public void setSubmitQuizListener(PreviewQuizButtonListener listener) {
        this.listener = listener;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listQuestionPanel = new javax.swing.JPanel();
        pageNavigation = new javax.swing.JPanel();
        finishQuiz = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        timeDisplayPanel = new javax.swing.JPanel();
        timeLeft = new javax.swing.JLabel();
        resultDisplayPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        startQuizLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        endQuizLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        timeTakenLabel = new javax.swing.JLabel();
        markLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listQuestionPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 10));
        jScrollPane1.setViewportView(listQuestionPanel);

        pageNavigation.setBackground(new java.awt.Color(255, 255, 255));
        pageNavigation.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pageNavigation.setLayout(new java.awt.BorderLayout(0, 20));

        org.openide.awt.Mnemonics.setLocalizedText(finishQuiz, org.openide.util.NbBundle.getMessage(Test.class, "Test.finishQuiz.text")); // NOI18N
        finishQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishQuizMouseClicked(evt);
            }
        });
        pageNavigation.add(finishQuiz, java.awt.BorderLayout.SOUTH);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel3.text")); // NOI18N
        pageNavigation.add(jLabel3, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        timeDisplayPanel.setBackground(new java.awt.Color(255, 255, 255));
        timeDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 51), null));

        timeLeft.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        timeLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(timeLeft, org.openide.util.NbBundle.getMessage(Test.class, "Test.timeLeft.text")); // NOI18N

        javax.swing.GroupLayout timeDisplayPanelLayout = new javax.swing.GroupLayout(timeDisplayPanel);
        timeDisplayPanel.setLayout(timeDisplayPanelLayout);
        timeDisplayPanelLayout.setHorizontalGroup(
            timeDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        timeDisplayPanelLayout.setVerticalGroup(
            timeDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLeft)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultDisplayPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(startQuizLabel, org.openide.util.NbBundle.getMessage(Test.class, "Test.startQuizLabel.text")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel8.text")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel9.text")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel10.text")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel11.text")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel12.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(endQuizLabel, org.openide.util.NbBundle.getMessage(Test.class, "Test.endQuizLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel14, org.openide.util.NbBundle.getMessage(Test.class, "Test.jLabel14.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(timeTakenLabel, org.openide.util.NbBundle.getMessage(Test.class, "Test.timeTakenLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(markLabel, org.openide.util.NbBundle.getMessage(Test.class, "Test.markLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(gradeLabel, org.openide.util.NbBundle.getMessage(Test.class, "Test.gradeLabel.text")); // NOI18N

        javax.swing.GroupLayout resultDisplayPanelLayout = new javax.swing.GroupLayout(resultDisplayPanel);
        resultDisplayPanel.setLayout(resultDisplayPanelLayout);
        resultDisplayPanelLayout.setHorizontalGroup(
            resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(resultDisplayPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startQuizLabel)
                            .addComponent(jLabel14))
                        .addGap(39, 39, 39)
                        .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(resultDisplayPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(endQuizLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeTakenLabel)
                    .addComponent(markLabel)
                    .addComponent(gradeLabel))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        resultDisplayPanelLayout.setVerticalGroup(
            resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(startQuizLabel)
                    .addComponent(jLabel10)
                    .addComponent(timeTakenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(markLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(endQuizLabel)
                    .addComponent(jLabel12)
                    .addComponent(gradeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(resultDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(timeDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishQuizMouseClicked
        // TODO add your handling code here:
        if (!isFinish) {

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to submit the quiz ?",
                    "Finish attempt", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                submitQuiz();
            }
        } else {
            this.dispose();
            listener.onSubmitQuiz();
        }
    }//GEN-LAST:event_finishQuizMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endQuizLabel;
    private javax.swing.JLabel finishQuiz;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listQuestionPanel;
    private javax.swing.JLabel markLabel;
    private javax.swing.JPanel pageNavigation;
    private javax.swing.JPanel resultDisplayPanel;
    private javax.swing.JLabel startQuizLabel;
    private javax.swing.JPanel timeDisplayPanel;
    private javax.swing.JLabel timeLeft;
    private javax.swing.JLabel timeTakenLabel;
    // End of variables declaration//GEN-END:variables
}
