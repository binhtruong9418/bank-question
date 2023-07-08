package view.quiz;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import model.Quiz;
import repository.quiz.GetAllQuiz;
import view.quiz_interface.QuizSelectListener;

public class ListQuizView extends javax.swing.JPanel {

    private QuizSelectListener quizSelectListener;

    public ListQuizView() {
        initComponents();
        initQuizData();
    }

    public void setQuizSelectListener(QuizSelectListener listener) {
        this.quizSelectListener = listener;
    }

    public void refreshQuizData() {
        DefaultListModel listModel = (DefaultListModel) listQuizView.getModel();
        listModel.setSize(0);
        initQuizData();
    }

    private void initQuizData() {
        DefaultListModel<Quiz> quizListModel = new DefaultListModel<>();
        listQuizView.setModel(quizListModel);
        listQuizView.setCellRenderer(new QuizItem());
        listQuizView.setSelectionModel(new DefaultListSelectionModel() {
            private boolean isAdjusting = false;

            @Override
            public void setSelectionInterval(int index0, int index1) {
                if (!isAdjusting) {
                    isAdjusting = true;

                    if (isSelectedIndex(index0)) {
                        removeSelectionInterval(index0, index1);
                    } else {
                        super.setSelectionInterval(index0, index1);
                    }

                    isAdjusting = false;
                }
            }
        });

        List<Quiz> listQuiz = new GetAllQuiz().getAllQuiz();
        for (Quiz quiz : listQuiz) {
            quizListModel.addElement(quiz);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listQuizView = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        listQuizView.setBorder(null);
        listQuizView.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listQuizViewValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listQuizView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listQuizViewValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listQuizViewValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting() && quizSelectListener != null) {
            // Get the selected item
            Quiz selectedQuiz = listQuizView.getSelectedValue();
            quizSelectListener.onQuizSelect(selectedQuiz);
        }
    }//GEN-LAST:event_listQuizViewValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Quiz> listQuizView;
    // End of variables declaration//GEN-END:variables
}
