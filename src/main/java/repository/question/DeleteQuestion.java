/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.question;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuestion {

    private Connection con = ConnectDB.connect();

    public DeleteQuestion() {
    }

    public void deleteQuestion(int questionId) {
        String sql = "DELETE FROM questions WHERE question_id = ?";
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setInt(1, questionId);
            pre.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error deleting question from the database: " + ex.getMessage());
        }
    }
}
