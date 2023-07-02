package view.quiz;

import java.util.List;
import javax.swing.DefaultListModel;
import model.Quiz;
import repository.quiz.GetAllQuiz;

public class ListQuizView extends javax.swing.JPanel {

    public ListQuizView() {
        initComponents();
        initQuizData();
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
        if (!evt.getValueIsAdjusting()) {
            // Get the selected item
            Quiz selectedQuiz = listQuizView.getSelectedValue();
            System.out.println("Selected item: " + selectedQuiz.getId());
        }
    }//GEN-LAST:event_listQuizViewValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Quiz> listQuizView;
    // End of variables declaration//GEN-END:variables
}
