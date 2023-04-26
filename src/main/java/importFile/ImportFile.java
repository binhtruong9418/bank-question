/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package importFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duc Binh
 */
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

    public void checkFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String currentQuestion = null;
            ArrayList<String> answerChoices = new ArrayList<>();
            String currentAnswer = null;
            int questionCount = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("A. ") || line.startsWith("B. ") || line.startsWith("C. ") || line.startsWith("D. ") || line.startsWith("E. ")) {
                    // This is an answer choice, add it to the list of answer choices
                    answerChoices.add(line);
                } else if (line.startsWith("ANSWER: ")) {
                    // This is the answer to the current question, store it
                    currentAnswer = line.replace("ANSWER:", "").trim();
                    // Do something with the question, answer choices, and answer
                    System.out.println(currentQuestion);
                    for (String answerChoice : answerChoices) {
                        System.out.println(answerChoice);
                    }
                    System.out.println("Answer: " + currentAnswer);
                    questionCount++;
                    // Reset the variables for the next question
                    currentQuestion = null;
                    answerChoices.clear();
                    currentAnswer = null;
                } else {
                    // This is a new question, store it
                    if (currentQuestion != null) {
                        // We've already read a question but haven't processed it yet
                        // Do something with the question, answer choices, and answer
                        System.out.println(currentQuestion);
                        for (String answerChoice : answerChoices) {
                            System.out.println(answerChoice);
                        }
                        System.out.println("Answer: " + currentAnswer);
                        questionCount++;
                        // Reset the variables for the next question
                        answerChoices.clear();
                        currentAnswer = null;
                    }
                    currentQuestion = line;
                }
            }
            // Check if there is a final question that we need to process
            if (currentQuestion != null) {
                // Do something with the question, answer choices, and answer
                System.out.println(currentQuestion);
                for (String answerChoice : answerChoices) {
                    System.out.println(answerChoice);
                }
                System.out.println("Answer: " + currentAnswer);
                questionCount++;
            }
            System.out.println("Total number of questions: " + questionCount);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
