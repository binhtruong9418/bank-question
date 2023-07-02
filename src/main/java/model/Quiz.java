package model;

import java.util.Date;
import java.util.List;

public class Quiz {
    
    private int id;
    
    private String name;

    private String description;

    private long timeStart;

    private long timeEnd;

    private int timeLimit;

    private List<Question> questions;

    private Float mark;

    public Quiz(int id, String name, String description, long timeStart, long timeEnd, int timeLimit) {
        this.name = name;
        this.description = description;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeLimit = timeLimit;
    }

    public Quiz() {

    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public long getTimeEnd() {
        return timeEnd;
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
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
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
