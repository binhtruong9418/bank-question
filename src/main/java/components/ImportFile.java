
package components;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Answer;
import model.Question;

public class ImportFile extends javax.swing.JPanel {

    private QuestionBank questionBank;

    private File importFile;

    public ImportFile() {
        initComponents();
        addDropAndDragFile();
    }

    public void getQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    private void addDropAndDragFile() {
        dragdropFileLabel.setDropTarget(
                new DropTarget() {
            @Override
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : droppedFiles) {
                        // process files
                        fileNameUploadLabel.setText(file.getName());
                        importFile = file;
                    }
                } catch (UnsupportedFlavorException | IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        );
    }

    private String checkAikenFile(File file) {
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
                    if (line.trim().equals("")) {
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
                        if (line.startsWith("A. ")) {
                            answerCount++;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 3) {
                        if (line.startsWith("B. ")) {
                            answerCount++;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 4) {
                        if (line.startsWith("C. ")) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 5) {
                        if (line.startsWith("D. ") && !correctAnswerFound) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 6) {
                        if (line.startsWith("E. ") && !correctAnswerFound) {
                            answerCount++;
                        } else if (line.startsWith("ANSWER: ")) {
                            correctAnswerFound = true;
                            totalLine += lineNum;
                        } else {
                            reader.close();
                            return "Error at: line " + (totalLine + lineNum);
                        }
                    } else if (lineNum == 7) {
                        if (line.startsWith("ANSWER: ") && !correctAnswerFound) {
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
            if (!questionFound || !correctAnswerFound || answerCount < 2) {
                return "Error at: line " + (totalLine + lineNum);
            }
            // File is valid
            return "Success - " + questionCount + " questions imported";
        } catch (IOException e) {
            return "Error: Unable to read file";
        }
    }

    private void addQuestionFromFile(File file) {
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                List<Answer> listAnswer;
                listAnswer = new ArrayList<>();
                String questionText = "";
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().equals("")) {
                        if (line.startsWith("A. ") || line.startsWith("B. ") || line.startsWith("C. ") || line.startsWith("D. ") || line.startsWith("E. ")) {
                            listAnswer.add(new Answer(line));
                        } else if (!line.startsWith("ANSWER: ")) {
                            questionText = line;
                        } else if (line.startsWith("ANSWER: ")) {
                            String correctAnswer = line.substring(line.length() - 1);
                            if (null != correctAnswer) {
                                switch (correctAnswer) {
                                    case "A":
                                        listAnswer.get(0).setGrade(Float.valueOf(100));
                                        break;
                                    case "B":
                                        listAnswer.get(1).setGrade(Float.valueOf(100));
                                        break;
                                    case "C":
                                        listAnswer.get(2).setGrade(Float.valueOf(100));
                                        break;
                                    case "D":
                                        listAnswer.get(3).setGrade(Float.valueOf(100));
                                        break;
                                    case "E":
                                        listAnswer.get(4).setGrade(Float.valueOf(100));
                                        break;
                                    default:
                                        break;
                                }
                            }
                            Question question = new Question();
                            question.setQuestionText(questionText);
                            question.setAnswers(listAnswer);
                            Question.listQuestion.add(question);
                            System.out.println("Question answer size: " + Question.listQuestion.get(0).toString());
                            listAnswer.clear();
                            questionText = "";
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importTitleLabel = new javax.swing.JLabel();
        fileFormatLabel = new javax.swing.JLabel();
        formatTypeLabel = new javax.swing.JLabel();
        importQuestionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        selectUploadFileButton = new javax.swing.JButton();
        requiredLabel3 = new javax.swing.JLabel();
        maximumSizeLabel = new javax.swing.JLabel();
        dragdropFileLabel = new javax.swing.JLabel();
        submitImportButton = new javax.swing.JButton();
        requiredText = new javax.swing.JLabel();
        requiredLabel4 = new javax.swing.JLabel();
        fileNameUploadLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        importTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        importTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(importTitleLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.importTitleLabel.text")); // NOI18N

        fileFormatLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fileFormatLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(fileFormatLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.fileFormatLabel.text")); // NOI18N

        formatTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(formatTypeLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.formatTypeLabel.text")); // NOI18N

        importQuestionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        importQuestionLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(importQuestionLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.importQuestionLabel.text")); // NOI18N

        selectUploadFileButton.setBackground(new java.awt.Color(7, 116, 163));
        selectUploadFileButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectUploadFileButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(selectUploadFileButton, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.selectUploadFileButton.text")); // NOI18N
        selectUploadFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUploadFileButtonActionPerformed(evt);
            }
        });

        requiredLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel3.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel3, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.requiredLabel3.text")); // NOI18N

        maximumSizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(maximumSizeLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.maximumSizeLabel.text")); // NOI18N

        dragdropFileLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dragdropFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dragdropFileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(dragdropFileLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.dragdropFileLabel.text")); // NOI18N
        dragdropFileLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dragdropFileLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        dragdropFileLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dragdropFileLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        submitImportButton.setBackground(new java.awt.Color(192, 36, 36));
        submitImportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitImportButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(submitImportButton, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.submitImportButton.text")); // NOI18N
        submitImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitImportButtonActionPerformed(evt);
            }
        });

        requiredText.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(requiredText, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.requiredText.text")); // NOI18N

        requiredLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel4.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel4, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.requiredLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(fileNameUploadLabel, org.openide.util.NbBundle.getMessage(ImportFile.class, "ImportFile.fileNameUploadLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileFormatLabel)
                                .addGap(234, 234, 234)
                                .addComponent(formatTypeLabel))
                            .addComponent(importTitleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(importQuestionLabel)
                        .addGap(117, 117, 117)
                        .addComponent(requiredLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dragdropFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectUploadFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(maximumSizeLabel))
                            .addComponent(submitImportButton)
                            .addComponent(fileNameUploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(requiredText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requiredLabel4)))
                .addContainerGap(574, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(importTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileFormatLabel)
                    .addComponent(formatTypeLabel))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectUploadFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requiredLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumSizeLabel)
                    .addComponent(importQuestionLabel))
                .addGap(18, 18, 18)
                .addComponent(dragdropFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(fileNameUploadLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitImportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requiredText))
                    .addComponent(requiredLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectUploadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUploadFileButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            fileNameUploadLabel.setText(selectedFile.getName());
            importFile = selectedFile;
        }
    }//GEN-LAST:event_selectUploadFileButtonActionPerformed

    private void submitImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitImportButtonActionPerformed
        // TODO add your handling code here:
        String result = checkAikenFile(importFile);
        if (result.startsWith("Success")) {
            addQuestionFromFile(importFile);
            JOptionPane.showMessageDialog(null, result, "Success", JOptionPane.INFORMATION_MESSAGE);
        } else if (result.startsWith("Error")) {
            System.out.print("Import Error");
            JOptionPane.showMessageDialog(null, result, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.print("Import Error");
            JOptionPane.showMessageDialog(null, "Import Error");
        }
    }//GEN-LAST:event_submitImportButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dragdropFileLabel;
    private javax.swing.JLabel fileFormatLabel;
    private javax.swing.JLabel fileNameUploadLabel;
    private javax.swing.JLabel formatTypeLabel;
    private javax.swing.JLabel importQuestionLabel;
    private javax.swing.JLabel importTitleLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel maximumSizeLabel;
    private javax.swing.JLabel requiredLabel3;
    private javax.swing.JLabel requiredLabel4;
    private javax.swing.JLabel requiredText;
    private javax.swing.JButton selectUploadFileButton;
    private javax.swing.JButton submitImportButton;
    // End of variables declaration//GEN-END:variables
}
