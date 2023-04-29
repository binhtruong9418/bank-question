package question;

import java.util.List;

public class ListQuestion {
    private static List<Question> listQuestions;

    public ListQuestion() {}

    public List<Question> getListQuestion () {
        return ListQuestion.listQuestions;
    }

    public void setListQuestion (List<Question> questionList) {
        ListQuestion.listQuestions = questionList;
    }

    public int length() {
        if(ListQuestion.listQuestions == null)
            return 0;
        else
            return ListQuestion.listQuestions.size();
    }
}
