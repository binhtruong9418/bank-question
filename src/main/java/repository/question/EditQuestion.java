/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.question;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.List;
import model.Answer;
import model.Question;

public class EditQuestion {

    public EditQuestion() {

    }

    public void editQuestion(Question question) {
        Connection con = ConnectDB.connect();
        int questionId = question.getId();
        String name = question.getName();
        String questionText = question.getQuestionText();
        int category = question.getCategory();
        float mark = question.getMark();
        List<Answer> listAnswer = question.getAnswers();
        System.out.println("db" + category);
        String sql = "UPDATE questions SET question_name = ?, question_category = ?, question_text = ?, question_mark = ?, "
                + "answer1_text = ?, answer1_grade = ?, answer2_text = ?, answer2_grade = ?, "
                + "answer3_text = ?, answer3_grade = ?, answer4_text = ?, answer4_grade = ?, "
                + "answer5_text = ?, answer5_grade = ? WHERE question_id = ?";
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setString(1, name);
            pre.setInt(2, category);
            pre.setString(3, questionText);
            pre.setFloat(4, mark);
            for (int i = 0; i < listAnswer.size(); i++) {
                pre.setString(5 + 2 * i, listAnswer.get(i).getText());
                pre.setFloat(6 + 2 * i, listAnswer.get(i).getGrade());
            }
            for (int i = listAnswer.size(); i < 5; i++) {
                pre.setNull(5 + 2 * i, NULL);
                pre.setFloat(6 + 2 * i, (float) 0);
            }
            pre.setInt(15, questionId);
            pre.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error editing question in the database: " + ex.getMessage());
        }
    }
}
