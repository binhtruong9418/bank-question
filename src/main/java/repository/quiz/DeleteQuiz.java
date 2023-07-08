/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.quiz;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.openide.util.Exceptions;

public class DeleteQuiz {

    private final Connection con = ConnectDB.connect();

    public DeleteQuiz() {

    }

    public void deleteQuiz(int quizId) {
        String sql = "DELETE FROM quizzes WHERE quiz_id = ?";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, quizId);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
