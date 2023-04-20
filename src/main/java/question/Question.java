package question;

import category.Category;

import java.awt.*;
import java.util.List;

public class Question {
    private String name;

    private Category category;

    private String questionText;

    private Image questionImage;

    private List<Answer> answers;


    public Question(String name, Category category, String questionText, Image questionImage, List<Answer> answers) {
        this.name = name;
        this.category = category;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answers = answers;
    }

    public Question() {

    }

    //geters and setters

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Image getQuestionImage() {
        return questionImage;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionImage(Image questionImage) {
        this.questionImage = questionImage;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }
}
