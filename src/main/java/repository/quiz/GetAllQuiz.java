package repository.quiz;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Quiz;
import org.openide.util.Exceptions;

public class GetAllQuiz {

    private final Connection con = ConnectDB.connect();

    public GetAllQuiz() {
    }

    public List<Quiz> getAllQuiz() {
        List<Quiz> listQuiz = new ArrayList<>();
        String sql = "SELECT * FROM quizzes";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("quiz_id");
                String name = rs.getString("quiz_name");
                String description = (String) rs.getObject("quiz_description");
                long timeStart = rs.getLong("time_start");
                long timeEnd = rs.getLong("time_end");
                Integer timeLimit = (Integer) rs.getObject("time_limit");
                int isShuffle = rs.getInt("is_shuffle");
                Quiz quiz = new Quiz();
                quiz.setId(id);
                quiz.setName(name);
                if (description == null) {
                    description = "";
                }
                quiz.setDescription(description);
                quiz.setTimeStart(timeStart);
                quiz.setTimeEnd(timeEnd);
                if (timeLimit == null) {
                    timeLimit = 0;
                }
                quiz.setTimeLimit(timeLimit);
                quiz.setIsShuffle(isShuffle == 1);
                listQuiz.add(quiz);
            }

            return listQuiz;
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return listQuiz;
    }
}
