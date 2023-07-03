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
import java.util.ArrayList;
import java.util.List;
import model.Answer;
import model.Question;

public class GetAllQuestion {

    public GetAllQuestion() {

    }

    public List<Question> getAllQuestionByCategoryId(int categoryId) {

        Connection con = ConnectDB.connect();
        List<Question> listQuestion = new ArrayList<>();
        String sql = "SELECT * FROM questions WHERE question_category = " + categoryId;
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("question_id");
                String questionText = rs.getString("question_text");
                String name = rs.getString("question_name");
                Integer category = (Integer) rs.getObject("question_category");
                Float mark = rs.getFloat("question_mark");

                //answer text
                String answerText1 = (String) rs.getObject("answer1_text");
                String answerText2 = (String) rs.getObject("answer2_text");
                String answerText3 = (String) rs.getObject("answer3_text");
                String answerText4 = (String) rs.getObject("answer4_text");
                String answerText5 = (String) rs.getObject("answer5_text");

                Float answerGrade1 = rs.getFloat("answer1_grade");
                Float answerGrade2 = rs.getFloat("answer2_grade");
                Float answerGrade3 = rs.getFloat("answer3_grade");
                Float answerGrade4 = rs.getFloat("answer4_grade");
                Float answerGrade5 = rs.getFloat("answer5_grade");

                Question question = new Question();
                List<Answer> listAnswer = new ArrayList<>();
                question.setQuestionText(questionText);
                question.setName(name);
                question.setId(id);
                question.setMark(mark);
                if (category == null) {
                    category = -1;
                }
                question.setCategory(category);

                for (int i = 1; i <= 5; i++) {
                    String clText = "answer" + i + "_text";
                    String clGrade = "answer" + i + "_grade";
                    Answer answer = new Answer();
                    String answerText = (String) rs.getObject(clText);
                    Float answerGrade = rs.getFloat(clGrade);

                    if (answerText == null) {
                        break;
                    } else {
                        answer.setText(answerText);
                        answer.setGrade(answerGrade);
                        listAnswer.add(answer);
                    }
                }
                question.setAnswers(listAnswer);
                listQuestion.add(question);
            }
            return listQuestion;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Question> getAllQuestionByListCategoryId(List<Integer> listCategoryId) {
        Connection con = ConnectDB.connect();

        List<Question> listQuestion = new ArrayList<>();

        StringBuilder categoryValues = new StringBuilder();
        for (Integer categoryId : listCategoryId) {
            if (categoryValues.length() > 0) {
                categoryValues.append(",");
            }
            categoryValues.append(categoryId);
        }

        String sql = "SELECT * FROM questions WHERE question_category IN (" + categoryValues + ")";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("question_id");
                String questionText = rs.getString("question_text");
                String name = rs.getString("question_name");
                Integer category = (Integer) rs.getObject("question_category");
                Float mark = rs.getFloat("question_mark");

                //answer text
                String answerText1 = (String) rs.getObject("answer1_text");
                String answerText2 = (String) rs.getObject("answer2_text");
                String answerText3 = (String) rs.getObject("answer3_text");
                String answerText4 = (String) rs.getObject("answer4_text");
                String answerText5 = (String) rs.getObject("answer5_text");

                Float answerGrade1 = rs.getFloat("answer1_grade");
                Float answerGrade2 = rs.getFloat("answer2_grade");
                Float answerGrade3 = rs.getFloat("answer3_grade");
                Float answerGrade4 = rs.getFloat("answer4_grade");
                Float answerGrade5 = rs.getFloat("answer5_grade");

                Question question = new Question();
                List<Answer> listAnswer = new ArrayList<>();
                question.setQuestionText(questionText);
                question.setName(name);
                question.setId(id);
                question.setMark(mark);
                if (category == null) {
                    category = -1;
                }
                question.setCategory(category);

                for (int i = 1; i <= 5; i++) {
                    String clText = "answer" + i + "_text";
                    String clGrade = "answer" + i + "_grade";
                    Answer answer = new Answer();
                    String answerText = (String) rs.getObject(clText);
                    Float answerGrade = rs.getFloat(clGrade);

                    if (answerText == null) {
                        break;
                    } else {
                        answer.setText(answerText);
                        answer.setGrade(answerGrade);
                        listAnswer.add(answer);
                    }
                }
                question.setAnswers(listAnswer);
                listQuestion.add(question);
            }
            return listQuestion;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
