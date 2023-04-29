package question;

import java.awt.*;

public class Answer {
    private String text;

//    private Image image;
//
//    private Float grade;

    public Answer(String text) {
        this.text = text;
//        this.image = image;
//        this.grade = grade;
    }

    public Answer() {

    }

    public String getText() {
        return text;
    }

//    public Image getImage() {
//        return image;
//    }
//
//    public Float getGrade() {
//        return grade;
//    }

    public void setText(String text) {
        this.text = text;
    }

//    public void setImage(Image image) {
//        this.image = image;
//    }
//
//    public void setGrade(Float grade) {
//        this.grade = grade;
//    }
}
