import java.awt.CardLayout;
import javax.swing.*;

import org.openide.awt.DropDownButtonFactory;
import question.Question;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ducbinh
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
        initListQuestionsTableData();
    }

    private void initListQuestionsTableData() {
        
        for(int i=0; i < Question.listQuestion.size(); i++) {
//            Question question = new Question();
//            question.setQuestionText("this is a question");
//            List<Answer> listAnswer = new ArrayList<>();
//            listAnswer.add(new Answer("A. Answer A"));
//            listAnswer.add(new Answer("B. Answer B"));
//            listAnswer.add(new Answer("C. Answer C"));
//            listAnswer.add(new Answer("D. Answer D"));
//            question.setAnswers(listAnswer);
//            Question.listQuestion.add(question);
            Question question = Question.listQuestion.get(i);
            listQuestionTable.addRow(question.toRowTable());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingMenu = new javax.swing.JPopupMenu();
        questionMenuItem = new javax.swing.JMenuItem();
        categoryMenuItem = new javax.swing.JMenuItem();
        importMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        page = new javax.swing.JPanel();
        itLabel = new javax.swing.JLabel();
        pageLink = new javax.swing.JLabel();
        turnEditingButton = new javax.swing.JButton();
        settingButton = DropDownButtonFactory.createDropDownButton(settingMenuButtonIcon, settingMenu);
        content = new javax.swing.JPanel();
        listQuiz = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainContent = new javax.swing.JPanel();
        menuContent = new javax.swing.JTabbedPane();
        questionTab = new javax.swing.JPanel();
        listQuestionTitleLabel = new javax.swing.JLabel();
        selectCategoryLabel = new javax.swing.JLabel();
        selectCategoryDropdown = new javax.swing.JComboBox<>();
        categoryDescriptionLabel = new javax.swing.JLabel();
        showSubcategoryCheckbox = new javax.swing.JCheckBox();
        createNewQuestionButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listQuestionTable = new components.ListQuestionTable();
        categoryTab = new javax.swing.JPanel();
        addCategoryTitleLabel = new javax.swing.JLabel();
        parentCategoryInputLabel = new javax.swing.JLabel();
        parentCategoryInput = new javax.swing.JComboBox<>();
        nameCategoryInputLabel = new javax.swing.JLabel();
        nameCategoryInput = new javax.swing.JTextField();
        categoryInfoInputLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryInfoInput = new javax.swing.JTextArea();
        IDNumberInputLabel = new javax.swing.JLabel();
        IDNumberInput = new javax.swing.JTextField();
        addCategoryButtonSubmit = new javax.swing.JButton();
        requiredText = new javax.swing.JLabel();
        requiredLabel1 = new javax.swing.JLabel();
        requiredLabel2 = new javax.swing.JLabel();
        importTab = new javax.swing.JPanel();
        importFile1 = new components.ImportFile();
        exportTab = new javax.swing.JPanel();

        settingMenu.setBackground(new java.awt.Color(7, 116, 163));
        settingMenu.setForeground(new java.awt.Color(7, 116, 163));

        questionMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(questionMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.questionMenuItem.text")); // NOI18N
        questionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(questionMenuItem);

        categoryMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(categoryMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryMenuItem.text")); // NOI18N
        categoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(categoryMenuItem);

        importMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(importMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.importMenuItem.text")); // NOI18N
        importMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(importMenuItem);

        exportMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(exportMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.exportMenuItem.text")); // NOI18N
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(exportMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        topbar.setBackground(new java.awt.Color(7, 116, 163));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton1.text")); // NOI18N

        jButton2.setBackground(new java.awt.Color(7, 116, 163));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no-profile.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton2.text")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setIconTextGap(10);

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        page.setPreferredSize(new java.awt.Dimension(172, 115));

        itLabel.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        itLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(itLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.itLabel.text")); // NOI18N

        pageLink.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(pageLink, org.openide.util.NbBundle.getMessage(Main.class, "Main.pageLink.text")); // NOI18N

        turnEditingButton.setBackground(new java.awt.Color(7, 116, 163));
        turnEditingButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        turnEditingButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(turnEditingButton, org.openide.util.NbBundle.getMessage(Main.class, "Main.turnEditingButton.text")); // NOI18N
        turnEditingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnEditingButtonActionPerformed(evt);
            }
        });

        settingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(settingButton, org.openide.util.NbBundle.getMessage(Main.class, "Main.settingButton.text")); // NOI18N
        settingButton.setBorder(null);
        settingButton.setContentAreaFilled(false);

        javax.swing.GroupLayout pageLayout = new javax.swing.GroupLayout(page);
        page.setLayout(pageLayout);
        pageLayout.setHorizontalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageLayout.createSequentialGroup()
                        .addComponent(itLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingButton))
                    .addGroup(pageLayout.createSequentialGroup()
                        .addComponent(pageLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turnEditingButton)))
                .addGap(16, 16, 16))
        );
        pageLayout.setVerticalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itLabel)
                    .addComponent(settingButton))
                .addGap(10, 10, 10)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageLink)
                    .addComponent(turnEditingButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        content.setLayout(new java.awt.CardLayout());

        listQuiz.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quiz.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout listQuizLayout = new javax.swing.GroupLayout(listQuiz);
        listQuiz.setLayout(listQuizLayout);
        listQuizLayout.setHorizontalGroup(
            listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuizLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1629, Short.MAX_VALUE))
        );
        listQuizLayout.setVerticalGroup(
            listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuizLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(873, Short.MAX_VALUE))
        );

        content.add(listQuiz, "card2");

        mainContent.setBackground(new java.awt.Color(255, 255, 255));

        questionTab.setBackground(new java.awt.Color(255, 255, 255));

        listQuestionTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        listQuestionTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(listQuestionTitleLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.listQuestionTitleLabel.text")); // NOI18N

        selectCategoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(selectCategoryLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.selectCategoryLabel.text")); // NOI18N

        selectCategoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        categoryDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(categoryDescriptionLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryDescriptionLabel.text")); // NOI18N
        categoryDescriptionLabel.setToolTipText(org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryDescriptionLabel.toolTipText")); // NOI18N

        showSubcategoryCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showSubcategoryCheckbox, org.openide.util.NbBundle.getMessage(Main.class, "Main.showSubcategoryCheckbox.text")); // NOI18N

        createNewQuestionButton.setBackground(new java.awt.Color(7, 116, 163));
        createNewQuestionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createNewQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(createNewQuestionButton, org.openide.util.NbBundle.getMessage(Main.class, "Main.createNewQuestionButton.text")); // NOI18N

        jScrollPane3.setBorder(null);

        listQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listQuestionTable);
        if (listQuestionTable.getColumnModel().getColumnCount() > 0) {
            listQuestionTable.getColumnModel().getColumn(0).setPreferredWidth(1800);
            listQuestionTable.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(Main.class, "Main.listQuestionTable.columnModel.title0")); // NOI18N
            listQuestionTable.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(Main.class, "Main.listQuestionTable.columnModel.title1_1")); // NOI18N
        }

        javax.swing.GroupLayout questionTabLayout = new javax.swing.GroupLayout(questionTab);
        questionTab.setLayout(questionTabLayout);
        questionTabLayout.setHorizontalGroup(
            questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionTabLayout.createSequentialGroup()
                .addGroup(questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(listQuestionTitleLabel))
                    .addGroup(questionTabLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryDescriptionLabel)
                            .addGroup(questionTabLayout.createSequentialGroup()
                                .addComponent(selectCategoryLabel)
                                .addGap(18, 18, 18)
                                .addComponent(selectCategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(showSubcategoryCheckbox)
                            .addComponent(createNewQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1530, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3))
        );
        questionTabLayout.setVerticalGroup(
            questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(listQuestionTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCategoryLabel)
                    .addComponent(selectCategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showSubcategoryCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createNewQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.questionTab.TabConstraints.tabTitle"), questionTab); // NOI18N

        categoryTab.setBackground(new java.awt.Color(255, 255, 255));

        addCategoryTitleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addCategoryTitleLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(addCategoryTitleLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.addCategoryTitleLabel.text")); // NOI18N

        parentCategoryInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(parentCategoryInputLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.parentCategoryInputLabel.text")); // NOI18N

        parentCategoryInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        parentCategoryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentCategoryInputActionPerformed(evt);
            }
        });

        nameCategoryInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(nameCategoryInputLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.nameCategoryInputLabel.text")); // NOI18N

        nameCategoryInput.setText(org.openide.util.NbBundle.getMessage(Main.class, "Main.nameCategoryInput.text")); // NOI18N

        categoryInfoInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(categoryInfoInputLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryInfoInputLabel.text")); // NOI18N

        categoryInfoInput.setColumns(20);
        categoryInfoInput.setRows(5);
        jScrollPane1.setViewportView(categoryInfoInput);

        IDNumberInputLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(IDNumberInputLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.IDNumberInputLabel.text")); // NOI18N

        IDNumberInput.setText(org.openide.util.NbBundle.getMessage(Main.class, "Main.IDNumberInput.text")); // NOI18N

        addCategoryButtonSubmit.setBackground(new java.awt.Color(192, 36, 36));
        addCategoryButtonSubmit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addCategoryButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(addCategoryButtonSubmit, org.openide.util.NbBundle.getMessage(Main.class, "Main.addCategoryButtonSubmit.text")); // NOI18N

        requiredText.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(requiredText, org.openide.util.NbBundle.getMessage(Main.class, "Main.requiredText.text")); // NOI18N
        requiredText.setToolTipText(org.openide.util.NbBundle.getMessage(Main.class, "Main.requiredText.toolTipText")); // NOI18N
        requiredText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        requiredLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel1.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel1, org.openide.util.NbBundle.getMessage(Main.class, "Main.requiredLabel1.text")); // NOI18N

        requiredLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        requiredLabel2.setForeground(new java.awt.Color(255, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(requiredLabel2, org.openide.util.NbBundle.getMessage(Main.class, "Main.requiredLabel2.text")); // NOI18N

        javax.swing.GroupLayout categoryTabLayout = new javax.swing.GroupLayout(categoryTab);
        categoryTab.setLayout(categoryTabLayout);
        categoryTabLayout.setHorizontalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTabLayout.createSequentialGroup()
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryTabLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCategoryTitleLabel)
                            .addGroup(categoryTabLayout.createSequentialGroup()
                                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(categoryTabLayout.createSequentialGroup()
                                        .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(parentCategoryInputLabel)
                                            .addComponent(categoryInfoInputLabel)
                                            .addComponent(IDNumberInputLabel))
                                        .addGap(207, 207, 207))
                                    .addGroup(categoryTabLayout.createSequentialGroup()
                                        .addComponent(nameCategoryInputLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(requiredLabel1)
                                        .addGap(12, 12, 12)))
                                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(parentCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameCategoryInput)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                    .addComponent(IDNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(categoryTabLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(addCategoryButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryTabLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(requiredText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requiredLabel2)))
                .addContainerGap(1272, Short.MAX_VALUE))
        );
        categoryTabLayout.setVerticalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addCategoryTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentCategoryInputLabel)
                    .addComponent(parentCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryTabLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(requiredLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameCategoryInputLabel)
                        .addComponent(nameCategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryInfoInputLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDNumberInputLabel)
                    .addComponent(IDNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCategoryButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requiredText)
                    .addComponent(requiredLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryTab.TabConstraints.tabTitle"), categoryTab); // NOI18N

        importTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout importTabLayout = new javax.swing.GroupLayout(importTab);
        importTab.setLayout(importTabLayout);
        importTabLayout.setHorizontalGroup(
            importTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importFile1, javax.swing.GroupLayout.DEFAULT_SIZE, 1930, Short.MAX_VALUE)
        );
        importTabLayout.setVerticalGroup(
            importTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importFile1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.importTab.TabConstraints.tabTitle"), importTab); // NOI18N

        exportTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout exportTabLayout = new javax.swing.GroupLayout(exportTab);
        exportTab.setLayout(exportTabLayout);
        exportTabLayout.setHorizontalGroup(
            exportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1930, Short.MAX_VALUE)
        );
        exportTabLayout.setVerticalGroup(
            exportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.exportTab.TabConstraints.tabTitle"), exportTab); // NOI18N

        javax.swing.GroupLayout mainContentLayout = new javax.swing.GroupLayout(mainContent);
        mainContent.setLayout(mainContentLayout);
        mainContentLayout.setHorizontalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuContent, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        mainContentLayout.setVerticalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContentLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(menuContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.add(mainContent, "mainContentCard");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, 1932, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void questionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionMenuItemActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if (source instanceof JMenuItem) {
            JMenuItem clickedMenuItem = (JMenuItem) source;
            String menuText = clickedMenuItem.getText();
            if ("Question".equals(menuText)) {
                CardLayout contentLayout = (CardLayout)content.getLayout();
                contentLayout.show(content, "mainContentCard");
                menuContent.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_questionMenuItemActionPerformed

    private void categoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuItemActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if (source instanceof JMenuItem) {
            JMenuItem clickedMenuItem = (JMenuItem) source;
            String menuText = clickedMenuItem.getText();
            if ("Categories".equals(menuText)) {
                CardLayout contentLayout = (CardLayout)content.getLayout();
                contentLayout.show(content, "mainContentCard");
                menuContent.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_categoryMenuItemActionPerformed

    private void importMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuItemActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if (source instanceof JMenuItem) {
            JMenuItem clickedMenuItem = (JMenuItem) source;
            String menuText = clickedMenuItem.getText();
            if ("Import".equals(menuText)) {
                CardLayout contentLayout = (CardLayout)content.getLayout();
                contentLayout.show(content, "mainContentCard");
                menuContent.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_importMenuItemActionPerformed

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMenuItemActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if (source instanceof JMenuItem) {
            JMenuItem clickedMenuItem = (JMenuItem) source;
            String menuText = clickedMenuItem.getText();
            if ("Export".equals(menuText)) {
                CardLayout contentLayout = (CardLayout)content.getLayout();
                contentLayout.show(content, "mainContentCard");
                menuContent.setSelectedIndex(3);
            }
        }
    }//GEN-LAST:event_exportMenuItemActionPerformed

    private void turnEditingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnEditingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnEditingButtonActionPerformed

    private void parentCategoryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentCategoryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentCategoryInputActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    private final ImageIcon settingMenuButtonIcon = new ImageIcon(getClass().getResource("/images/settings.png"));


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDNumberInput;
    private javax.swing.JLabel IDNumberInputLabel;
    private javax.swing.JButton addCategoryButtonSubmit;
    private javax.swing.JLabel addCategoryTitleLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel categoryDescriptionLabel;
    private javax.swing.JTextArea categoryInfoInput;
    private javax.swing.JLabel categoryInfoInputLabel;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JPanel categoryTab;
    private javax.swing.JPanel content;
    private javax.swing.JButton createNewQuestionButton;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JPanel exportTab;
    private components.ImportFile importFile1;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JPanel importTab;
    private javax.swing.JLabel itLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private components.ListQuestionTable listQuestionTable;
    private javax.swing.JLabel listQuestionTitleLabel;
    private javax.swing.JPanel listQuiz;
    private javax.swing.JPanel mainContent;
    private javax.swing.JTabbedPane menuContent;
    private javax.swing.JTextField nameCategoryInput;
    private javax.swing.JLabel nameCategoryInputLabel;
    private javax.swing.JPanel page;
    private javax.swing.JLabel pageLink;
    private javax.swing.JComboBox<String> parentCategoryInput;
    private javax.swing.JLabel parentCategoryInputLabel;
    private javax.swing.JMenuItem questionMenuItem;
    private javax.swing.JPanel questionTab;
    private javax.swing.JLabel requiredLabel1;
    private javax.swing.JLabel requiredLabel2;
    private javax.swing.JLabel requiredText;
    private javax.swing.JComboBox<String> selectCategoryDropdown;
    private javax.swing.JLabel selectCategoryLabel;
    private javax.swing.JButton settingButton;
    private javax.swing.JPopupMenu settingMenu;
    private javax.swing.JCheckBox showSubcategoryCheckbox;
    private javax.swing.JPanel topbar;
    private javax.swing.JButton turnEditingButton;
    // End of variables declaration//GEN-END:variables
        
}
