package model;

import java.util.List;

public class Question {

    private Integer id;

    private String name;

    private Integer category;

    private String questionText;

    private List<Answer> answers;

    private Answer rightAnswer;

    private Float mark;

    public Question(String name, int category, String questionText, Float mark, List<Answer> answers, int id) {
        this.name = name;
        this.category = category;
        this.questionText = questionText;
        this.mark = mark;
        this.answers = answers;
        this.id = id;
    }

    public Question() {

    }

    //geters and setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCategory() {
        return category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Float getMark() {
        return mark;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        String result = this.name + " " + this.questionText;
        return result;
    }

    public Object[] toRowTable() {
        return new Object[]{this.toString(), "Edit"};
    }
}
