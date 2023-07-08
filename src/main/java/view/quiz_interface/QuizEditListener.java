/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view.quiz_interface;

import model.Quiz;

/**
 *
 * @author Duc Binh
 */
public interface QuizEditListener {
    void onSaveEditQuiz(Quiz quiz);
    void onDeleteQuiz();
}
