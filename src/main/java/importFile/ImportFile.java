
package importFile;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import question.Answer;
import question.Question;

public class ImportFile {
    private File importFile;
    
    public ImportFile (File file) {
        this.importFile = file;
    }

    public ImportFile () {}

    public File getImportFile() {
        return this.importFile;
    }

    public void setImportFile(File file) {
        this.importFile = file;
    }

    public static String checkAikenFile(File file) {
        // Check file extension
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex == -1 || !fileName.substring(dotIndex).equalsIgnoreCase(".txt")) {
            return "Error at line 1: File must have .txt extension";
        }

        try {
            int totalLine;
            int lineNum;
            int answerCount;
            int questionCount;
            boolean questionFound;
            boolean correctAnswerFound;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                totalLine = 0;
                lineNum = 1;
                answerCount = 0;
                questionCount = 0;
                questionFound = false;
                boolean blankLineExpected = false;
                correctAnswerFound = false;
                while ((line = reader.readLine()) != null) {
                    if(line.trim().equals("")) {
                        if (!questionFound || !correctAnswerFound || answerCount < 2 || blankLineExpected) {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                        
                        questionFound = false;
                        correctAnswerFound = false;
                        blankLineExpected = false;
                        answerCount = 0;
                        totalLine++;
                        lineNum = 0;
                        
                    } else if (lineNum == 1) {
                        questionFound = true;
                        questionCount++;
                        answerCount = 0;
                    } else if (lineNum == 2) {
                        if(line.startsWith("A. ")) {
                            answerCount++;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 3) {
                        if(line.startsWith("B. ")) {
                            answerCount++;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 4) {
                        if(line.startsWith("C. ")) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        }
                        else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 5) {
                        if(line.startsWith("D. ") && !correctAnswerFound) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        }
                        else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 6) {
                        if(line.startsWith("E. ") && !correctAnswerFound) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        }
                        else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 7) {
                        if(line.startsWith("ANSWER: ") && !correctAnswerFound) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    }
                    lineNum++;
                }
            }
            if(!questionFound || !correctAnswerFound || answerCount < 2) {
                return "Error at: line " + (totalLine + lineNum);
            }
            // File is valid
            return "Success - " + questionCount + " questions imported";
        } catch (IOException e) {
            return "Error: Unable to read file";
        }
    }
    
    public static void addQuestionFromFile (File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            List<Answer> listAnswer;
            listAnswer = new ArrayList<>();
            Question question = new Question();
            while ((line = reader.readLine()) != null) {
                if(!line.trim().equals("")) {
                    if(line.startsWith("A. ") || line.startsWith("B. ") || line.startsWith("C. ") || line.startsWith("D. ") || line.startsWith("E. ")) {
                        listAnswer.add(new Answer(line));
                        System.out.print(line);
                    } else if(!line.startsWith("ANSWER: ")) {
                        question.setQuestionText(line);
                        System.out.print(line);
                    }
                } else {
                    question.setAnswers(listAnswer);
                    Question.listQuestion.add(question);
                    listAnswer.clear();
                    question = new Question();
                }
            }
            
        } catch (IOException e) {
            
        }
    }
}
