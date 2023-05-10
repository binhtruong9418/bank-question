package model;

import model.Question;

import java.util.Date;
import java.util.List;

public class Quiz {
    private String name;

    private String description;

    private Date openTime;

    private Date closeTime;

    private Integer timeLimit;

    private List<Question> questions;

    private Float mark;

    public Quiz(String name, String description, Date openTime, Date closeTime, Integer timeLimit) {
        this.name = name;
        this.description = description;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.timeLimit = timeLimit;
    }

    public Quiz() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Float getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }
}
