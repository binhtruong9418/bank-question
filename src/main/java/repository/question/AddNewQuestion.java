/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.question;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;
import java.util.List;
import model.Answer;
import model.Question;
import repository.category.EditCategory;

public class AddNewQuestion {

    public AddNewQuestion() {
    }

    public int addANewQuestion(Question question) {
        Connection con = ConnectDB.connect();
        int generatedQuestionId = -1; // Default value for failure

        String name = question.getName();
        String questionText = question.getQuestionText();
        int category = question.getCategory();
        float mark = question.getMark();
        List<Answer> listAnswer = question.getAnswers();
        String sql = "INSERT INTO questions (question_name, question_category, question_text, question_mark, "
                + "answer1_text, answer1_grade, answer2_text, answer2_grade, "
                + "answer3_text, answer3_grade, answer4_text, answer4_grade, "
                + "answer5_text, answer5_grade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pre = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
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
            int affectedRows = pre.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = pre.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedQuestionId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error adding question to the database: " + ex.getMessage());
        }

        return generatedQuestionId;

    }

    public int addListNewQuestion(List<Question> questions) {
        Connection con = ConnectDB.connect();
        int numQuestionsAdded = 0;

        String sql = "INSERT INTO questions (question_name, question_category, question_text, question_mark, "
                + "answer1_text, answer1_grade, answer2_text, answer2_grade, "
                + "answer3_text, answer3_grade, answer4_text, answer4_grade, "
                + "answer5_text, answer5_grade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement pre = con.prepareStatement(sql)) {
            for (Question question : questions) {
                String name = question.getName();
                String questionText = question.getQuestionText();
                int category = question.getCategory();
                float mark = question.getMark();
                List<Answer> listAnswer = question.getAnswers();

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
                int affectedRows = pre.executeUpdate();
                if (affectedRows > 0) {
                    numQuestionsAdded++;
                }
            }
            System.out.println("Questions added successfully!");
        } catch (SQLException ex) {
            System.out.println("Error adding questions to the database: " + ex.getMessage());
        }

        return numQuestionsAdded;

    }

}
