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
                    + "category_id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "category_name VARCHAR(200) NOT NULL,"
                    + "category_parent INT DEFAULT NULL,"
                    + "category_info VARCHAR(200) DEFAULT NULL,"
                    + "category_id_number INT DEFAULT NULL,"
                    + "category_count_question INT NOT NULL DEFAULT 0"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createCategoriesTableSQL);

            // Table: questions
            String createQuestionsTableSQL = "CREATE TABLE IF NOT EXISTS questions ("
                    + "question_id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "question_name VARCHAR(200) NOT NULL,"
                    + "question_category INT NOT NULL DEFAULT 0,"
                    + "question_text VARCHAR(1000) NOT NULL,"
                    + "question_mark FLOAT NOT NULL DEFAULT 1,"
                    + "answer1_text VARCHAR(300) DEFAULT NULL,"
                    + "answer1_grade FLOAT NOT NULL DEFAULT 0,"
                    + "answer2_text VARCHAR(300) DEFAULT NULL,"
                    + "answer2_grade FLOAT NOT NULL DEFAULT 0,"
                    + "answer3_text VARCHAR(300) DEFAULT NULL,"
                    + "answer3_grade FLOAT NOT NULL DEFAULT 0,"
                    + "answer4_text VARCHAR(300) DEFAULT NULL,"
                    + "answer4_grade FLOAT NOT NULL DEFAULT 0,"
                    + "answer5_text VARCHAR(300) DEFAULT NULL,"
                    + "answer5_grade FLOAT NOT NULL DEFAULT 0,"
                    + "KEY FK_CategoryQuestion (question_category),"
                    + "FOREIGN KEY (question_category) REFERENCES categories (category_id)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            statement.execute(createQuestionsTableSQL);

            // Table: quizzes
            String createQuizzesTableSQL = "CREATE TABLE IF NOT EXISTS quizzes ("
                    + "quiz_id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "quiz_name VARCHAR(255) NOT NULL,"
                    + "quiz_description VARCHAR(1000) DEFAULT NULL,"
                    + "time_limit INT NOT NULL DEFAULT 0,"
                    + "time_start BIGINT NOT NULL,"
                    + "time_end BIGINT NOT NULL,"
                    + "is_shuffle INT NOT NULL DEFAULT 0"
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
