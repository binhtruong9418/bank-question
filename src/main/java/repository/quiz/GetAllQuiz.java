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

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet rs = null;

    public GetAllQuiz() {
    }

    public List<Quiz> getAllQuiz() {
        con = ConnectDB.connect();
        List<Quiz> listQuiz = new ArrayList<>();
        String sql = "SELECT * FROM quizzes";
        try {
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("quiz_id");
                String name = rs.getString("quiz_name");
                String description = (String) rs.getObject("quiz_description");
                long timeStart = rs.getLong("time_start");
                long timeEnd = rs.getLong("time_end");
                Integer timeLimit = (Integer) rs.getObject("time_limit");
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
                listQuiz.add(quiz);
            }

            return listQuiz;
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return listQuiz;
    }
}
