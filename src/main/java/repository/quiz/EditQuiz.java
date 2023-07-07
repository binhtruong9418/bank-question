package repository.quiz;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditQuiz {

    private final Connection con = ConnectDB.connect();

    public EditQuiz() {

    }

    public void editQuiz(int quizId, Boolean isShuffle) {

        String sql = "UPDATE quizzes SET is_shuffle = ? WHERE quiz_id = ?";

        try (PreparedStatement pre = con.prepareStatement(sql)) {
            int status = isShuffle ? 1 : 0;
            pre.setInt(1, status); // Set the new is_shuffle value
            pre.setInt(2, quizId); // Assuming quiz_id is available in the Quiz object
            pre.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error updating quiz in the database: " + ex.getMessage());
        }
    }
}
