/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.quiz;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;
import model.Quiz;

public class AddNewQuiz {

    private Connection con = ConnectDB.connect();

    public AddNewQuiz() {

    }

    public int addNewQuiz(Quiz quiz) {
        int generatedQuizId = -1; // Default value for failure

        String sql = "INSERT INTO quizzes (quiz_name, quiz_description, time_start, time_end, time_limit) VALUES (?,?,?,?,?)";

        try (PreparedStatement pre = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pre.setString(1, quiz.getName());
            pre.setString(2, quiz.getDescription());
            pre.setLong(3, quiz.getTimeStart());
            pre.setLong(4, quiz.getTimeEnd());
            if (quiz.getTimeLimit() == 0) {
                pre.setObject(5, NULL);
            } else {
                pre.setInt(5, quiz.getTimeLimit());
            }
            int affectedRows = pre.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = pre.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedQuizId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error adding quiz to the database: " + ex.getMessage());
        }
        return generatedQuizId;
    }
}
