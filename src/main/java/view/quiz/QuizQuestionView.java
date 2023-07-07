package view.quiz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import model.Answer;
import model.Question;
import view.quiz.checkbox.CircleCheckBox;
import view.quiz.checkbox.SquareCheckBox;

public class QuizQuestionView extends javax.swing.JPanel {

    private Question currentQuestion;
    private List<Answer> listSelectedAnswer;

    public QuizQuestionView(Question question) {
        this.currentQuestion = question;
        this.listSelectedAnswer = new ArrayList<>();
        initComponents();
        rightAnswerPanel.setVisible(false);
        setLabel(question.getName() + ": " + question.getQuestionText());
        addData();
    }

    private void setLabel(String text) {
        String wrappertext = "<html><body style='width: 800px; white-space: pre-wrap;'>"
                + text
                + "</html>";
        question.setText(wrappertext);
    }

    private class CircleCheckboxListCellRenderer extends JPanel implements ListCellRenderer<Answer> {

        private CircleCheckBox checkBox;
        private JLabel label;

        public CircleCheckboxListCellRenderer() {
            setLayout(new BorderLayout());
            setOpaque(true);
            setBorder(new EmptyBorder(5, 10, 5, 10));

            JPanel westPanel = new JPanel(new BorderLayout());
            westPanel.setOpaque(false);

            checkBox = new CircleCheckBox();
            label = new JLabel();
            Font currentFont = label.getFont();
            Font newFont = currentFont.deriveFont(14f);
            label.setFont(newFont);
            label.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

            westPanel.add(checkBox, BorderLayout.NORTH);
            add(westPanel, BorderLayout.WEST);
            add(label, BorderLayout.CENTER);

        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Answer> list, Answer answer, int index,
                boolean isSelected, boolean cellHasFocus) {

            String labelAlphaBet = String.valueOf((char) ('A' + index));
            String wrapperText = "<html><body style='width: 800px; white-space: pre-wrap;'>" + labelAlphaBet + ". " + answer.getText() + "</html>";

            label.setText(wrapperText);
            checkBox.setSelected(isSelected);

            setBackground(list.getBackground());
            setForeground(list.getForeground());

            if (isSelected && cellHasFocus) {
                int answerIndex = list.getSelectedIndex();
                Answer selectedAnswer = list.getModel().getElementAt(answerIndex);

                listSelectedAnswer.clear();
                listSelectedAnswer.add(selectedAnswer);
                // Handle the selected answer here
            }

            return this;
        }
    }

    private class SquareCheckboxListCellRenderer extends JPanel implements ListCellRenderer<Answer> {

        private SquareCheckBox checkBox;
        private JLabel label;

        public SquareCheckboxListCellRenderer() {
            setLayout(new BorderLayout());
            setOpaque(true);
            setBorder(new EmptyBorder(5, 10, 5, 10));

            JPanel westPanel = new JPanel(new BorderLayout());
            westPanel.setOpaque(false);

            checkBox = new SquareCheckBox();
            label = new JLabel();
            Font currentFont = label.getFont();
            Font newFont = currentFont.deriveFont(14f);
            label.setFont(newFont);
            label.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

            westPanel.add(checkBox, BorderLayout.NORTH);
            add(westPanel, BorderLayout.WEST);
            add(label, BorderLayout.CENTER);

        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Answer> list, Answer answer, int index,
                boolean isSelected, boolean cellHasFocus) {

            String labelAlphaBet = String.valueOf((char) ('A' + index));
            String wrapperText = "<html><body style='width: 800px; white-space: pre-wrap;'>" + labelAlphaBet + ". " + answer.getText() + "</html>";

            label.setText(wrapperText);
            checkBox.setSelected(isSelected);

            setBackground(list.getBackground());
            setForeground(list.getForeground());

            if (isSelected) {
                if (listSelectedAnswer.contains(answer)) {
                    listSelectedAnswer.remove(answer);
                } else {
                    listSelectedAnswer.add(answer);
                }
            }

            return this;
        }
    }

    void setchoicequestion(String text) {
        title.setText(text);
    }

    private void addData() {
        DefaultListModel<Answer> listModel = new DefaultListModel<>();

        int countAnswer = currentQuestion.getAnswers().size();
        for (int i = 0; i < countAnswer; i++) {
            Answer answer = currentQuestion.getAnswers().get(i);
            listModel.addElement(answer);
        }
        listAnswerList.setModel(listModel);
        for (Answer answer : currentQuestion.getAnswers()) {
            if (answer.getGrade().intValue() == 100) {
                listAnswerList.setCellRenderer(new CircleCheckboxListCellRenderer());
                listAnswerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                break;
            } else if (answer.getGrade().intValue() != 100 && answer.getGrade().intValue() != 0) {
                listAnswerList.setCellRenderer(new SquareCheckboxListCellRenderer());
                listAnswerList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                break;
            }
        }
        listAnswerList.setVisibleRowCount(countAnswer);

        listAnswerList.revalidate();
        listAnswerList.repaint();
    }

//    public List<Integer> getSelectedAnswer() {
//        
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        mark = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAnswerList = new javax.swing.JList<>();
        questionTextPanel = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        rightAnswerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        leftPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.openide.awt.Mnemonics.setLocalizedText(title, org.openide.util.NbBundle.getMessage(QuizQuestionView.class, "QuizQuestionView.title.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(status, org.openide.util.NbBundle.getMessage(QuizQuestionView.class, "QuizQuestionView.status.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(mark, org.openide.util.NbBundle.getMessage(QuizQuestionView.class, "QuizQuestionView.mark.text")); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mark)
                    .addComponent(title)
                    .addComponent(status))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(mark)
                .addGap(24, 24, 24))
        );

        rightPanel.setBackground(new java.awt.Color(231, 243, 245));
        rightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listAnswerList.setBackground(new java.awt.Color(231, 243, 245));
        listAnswerList.setBorder(null);
        listAnswerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listAnswerList.setVisibleRowCount(5);
        jScrollPane1.setViewportView(listAnswerList);

        questionTextPanel.setBackground(new java.awt.Color(231, 243, 245));
        questionTextPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        question.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        question.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(question, org.openide.util.NbBundle.getMessage(QuizQuestionView.class, "QuizQuestionView.question.text")); // NOI18N
        question.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout questionTextPanelLayout = new javax.swing.GroupLayout(questionTextPanel);
        questionTextPanel.setLayout(questionTextPanelLayout);
        questionTextPanelLayout.setHorizontalGroup(
            questionTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(question, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        questionTextPanelLayout.setVerticalGroup(
            questionTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(questionTextPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightAnswerPanel.setBackground(new java.awt.Color(252, 239, 220));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(QuizQuestionView.class, "QuizQuestionView.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout rightAnswerPanelLayout = new javax.swing.GroupLayout(rightAnswerPanel);
        rightAnswerPanel.setLayout(rightAnswerPanelLayout);
        rightAnswerPanelLayout.setHorizontalGroup(
            rightAnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAnswerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightAnswerPanelLayout.setVerticalGroup(
            rightAnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAnswerPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rightAnswerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightAnswerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JList<Answer> listAnswerList;
    private javax.swing.JLabel mark;
    private javax.swing.JLabel question;
    private javax.swing.JPanel questionTextPanel;
    private javax.swing.JPanel rightAnswerPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
