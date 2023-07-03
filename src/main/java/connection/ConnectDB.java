package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectDB {

    private static Boolean firstConnect = true;

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            conn = DriverManager.getConnection(url, "root", "");
            if (firstConnect) {
                createDatabaseStructure(conn);
                firstConnect = false;
            }
            conn.setCatalog("bank_question");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Please connect to the database!", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private static void createDatabaseStructure(Connection conn) {
        System.out.println("Creating database structure...");
        try (Statement statement = conn.createStatement()) {
            // Create database if not exists
            statement.execute("CREATE DATABASE IF NOT EXISTS bank_question");

            // Use the bank_question database
            statement.execute("USE bank_question");

            // Table: categories
            String createCategoriesTableSQL = "CREATE TABLE IF NOT EXISTS categories ("
                    + "category_id int(11) NOT NULL,"
                    + "category_name varchar(200) NOT NULL,"
                    + "category_parent int(11) DEFAULT NULL,"
                    + "category_info varchar(200) DEFAULT NULL,"
                    + "category_id_number int(11) DEFAULT NULL,"
                    + "category_count_question int(11) NOT NULL DEFAULT 0,"
                    + "PRIMARY KEY (category_id)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createCategoriesTableSQL);

            // Table: questions
            String createQuestionsTableSQL = "CREATE TABLE IF NOT EXISTS questions ("
                    + "question_id int(11) NOT NULL,"
                    + "question_name varchar(200) NOT NULL,"
                    + "question_category int(11) NOT NULL DEFAULT 0,"
                    + "question_text varchar(1000) NOT NULL,"
                    + "question_mark float NOT NULL DEFAULT 1,"
                    + "answer1_text varchar(300) DEFAULT NULL,"
                    + "answer1_grade float NOT NULL DEFAULT 0,"
                    + "answer2_text varchar(300) DEFAULT NULL,"
                    + "answer2_grade float NOT NULL DEFAULT 0,"
                    + "answer3_text varchar(300) DEFAULT NULL,"
                    + "answer3_grade float NOT NULL DEFAULT 0,"
                    + "answer4_text varchar(300) DEFAULT NULL,"
                    + "answer4_grade float NOT NULL DEFAULT 0,"
                    + "answer5_text varchar(300) DEFAULT NULL,"
                    + "answer5_grade float NOT NULL DEFAULT 0,"
                    + "PRIMARY KEY (question_id),"
                    + "KEY FK_CategoryQuestion (question_category),"
                    + "FOREIGN KEY (question_category) REFERENCES categories (category_id)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createQuestionsTableSQL);

            // Table: quizzes
            String createQuizzesTableSQL = "CREATE TABLE IF NOT EXISTS quizzes ("
                    + "quiz_id int(11) NOT NULL,"
                    + "quiz_name varchar(255) NOT NULL,"
                    + "quiz_description varchar(1000) DEFAULT NULL,"
                    + "time_limit int(11) DEFAULT NULL,"
                    + "time_start bigint(20) NOT NULL,"
                    + "time_end bigint(20) NOT NULL,"
                    + "PRIMARY KEY (quiz_id)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createQuizzesTableSQL);

            // Table: quiz_question
            String createQuizQuestionTableSQL = "CREATE TABLE IF NOT EXISTS quiz_question ("
                    + "quiz_id int(11) NOT NULL,"
                    + "question_id int(11) NOT NULL,"
                    + "PRIMARY KEY (quiz_id, question_id),"
                    + "KEY FK_QuizQuestion (quiz_id),"
                    + "KEY FK_QuestionQuiz (question_id),"
                    + "FOREIGN KEY (quiz_id) REFERENCES quizzes (quiz_id),"
                    + "FOREIGN KEY (question_id) REFERENCES questions (question_id)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createQuizQuestionTableSQL);

            // Trigger: update_category_count_question
            String createTriggerSQL = "CREATE TRIGGER IF NOT EXISTS `update_category_count_question` "
                    + "AFTER INSERT ON `questions` "
                    + "FOR EACH ROW "
                    + "UPDATE categories SET category_count_question = category_count_question + 1 "
                    + "WHERE category_id = NEW.question_category";
            statement.execute(createTriggerSQL);
            
            // Trigger: update_category_count_question_delete
            String deleteTriggerSQL = "CREATE TRIGGER IF NOT EXISTS `update_category_count_question_delete` "
                    + "AFTER DELETE ON `questions` "
                    + "FOR EACH ROW "
                    + "UPDATE categories SET category_count_question = category_count_question - 1 "
                    + "WHERE category_id = OLD.question_category";
            statement.execute(deleteTriggerSQL);

            System.out.println("Database structure created successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
