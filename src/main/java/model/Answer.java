package model;

import java.awt.*;

public class Answer {
    private String text;

    private Float grade;

    public Answer(String text, Float grade) {
        this.text = text;
        this.grade = grade;
    }

    public Answer(String text) {
        this.text = text;
    }

    public Answer() {

    }

    public String getText() {
        return text;
    }

    public Float getGrade() {
        return grade;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
