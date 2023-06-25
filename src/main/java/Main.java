import components.AddingANewQuizView;

import java.awt.CardLayout;
import javax.swing.*;
//quang test thử
import components.QuestionBank;
import org.openide.awt.DropDownButtonFactory;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
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
        jLabel2 = new javax.swing.JLabel();
        mainContent = new javax.swing.JPanel();
        menuContent = new javax.swing.JTabbedPane();
        questionTab = new javax.swing.JPanel();
        questionBank1 = new components.QuestionBank();
        categoryTab = new javax.swing.JPanel();
        addCategory1 = new components.AddCategory();
        importTab = new javax.swing.JPanel();
        importFile1 = new components.ImportFile();
        exportTab = new javax.swing.JPanel();
        CongNgheView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        EditQuizCongNghe = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        PreviewQuiz = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

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
                .addContainerGap())
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
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quiz.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout listQuizLayout = new javax.swing.GroupLayout(listQuiz);
        listQuiz.setLayout(listQuizLayout);
        listQuizLayout.setHorizontalGroup(
            listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuizLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1451, Short.MAX_VALUE))
            .addGroup(listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listQuizLayout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1607, Short.MAX_VALUE)))
        );
        listQuizLayout.setVerticalGroup(
            listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuizLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(904, Short.MAX_VALUE))
            .addGroup(listQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listQuizLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel2)
                    .addContainerGap(944, Short.MAX_VALUE)))
        );

        content.add(listQuiz, "card2");

        mainContent.setBackground(new java.awt.Color(255, 255, 255));

        questionTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout questionTabLayout = new javax.swing.GroupLayout(questionTab);
        questionTab.setLayout(questionTabLayout);
        questionTabLayout.setHorizontalGroup(
            questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionBank1, javax.swing.GroupLayout.DEFAULT_SIZE, 1918, Short.MAX_VALUE)
        );
        questionTabLayout.setVerticalGroup(
            questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionTabLayout.createSequentialGroup()
                .addComponent(questionBank1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.questionTab.TabConstraints.tabTitle"), questionTab); // NOI18N

        categoryTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout categoryTabLayout = new javax.swing.GroupLayout(categoryTab);
        categoryTab.setLayout(categoryTabLayout);
        categoryTabLayout.setHorizontalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCategory1, javax.swing.GroupLayout.DEFAULT_SIZE, 1918, Short.MAX_VALUE)
        );
        categoryTabLayout.setVerticalGroup(
            categoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCategory1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );

        menuContent.addTab(org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryTab.TabConstraints.tabTitle"), categoryTab); // NOI18N

        importTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout importTabLayout = new javax.swing.GroupLayout(importTab);
        importTab.setLayout(importTabLayout);
        importTabLayout.setHorizontalGroup(
            importTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importFile1, javax.swing.GroupLayout.DEFAULT_SIZE, 1918, Short.MAX_VALUE)
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
            .addGap(0, 1918, Short.MAX_VALUE)
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
                .addGap(0, 107, Short.MAX_VALUE)
                .addComponent(menuContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.add(mainContent, "mainContentCard");

        CongNgheView.setBackground(new java.awt.Color(255, 255, 255));
        CongNgheView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel3.text")); // NOI18N
        CongNgheView.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 33, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel4.text")); // NOI18N
        CongNgheView.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel5.text")); // NOI18N
        CongNgheView.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel6.text")); // NOI18N
        CongNgheView.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 161, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel7.text")); // NOI18N
        jLabel7.setOpaque(true);
        CongNgheView.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 1320, 30));

        jLabel9.setBackground(new java.awt.Color(225, 225, 225));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel9.text")); // NOI18N
        jLabel9.setOpaque(true);
        CongNgheView.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 1320, 30));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CongNgheView.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jump to ...", "Item 2", "Item 3", "Item 4" }));
        CongNgheView.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 400, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel8.text")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        CongNgheView.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 30, 30, 30));

        content.add(CongNgheView, "CongNgheViewCard");

        EditQuizCongNghe.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel10.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel11.text")); // NOI18N

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton4, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton4.text")); // NOI18N

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton5, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel12.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(Main.class, "Main.jTextField1.text")); // NOI18N

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton6, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel13.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(Main.class, "Main.jCheckBox1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel14, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel14.text")); // NOI18N

        javax.swing.GroupLayout EditQuizCongNgheLayout = new javax.swing.GroupLayout(EditQuizCongNghe);
        EditQuizCongNghe.setLayout(EditQuizCongNgheLayout);
        EditQuizCongNgheLayout.setHorizontalGroup(
            EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditQuizCongNgheLayout.createSequentialGroup()
                        .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1221, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)))))
                        .addGap(259, 259, 259))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditQuizCongNgheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(350, 350, 350))
        );
        EditQuizCongNgheLayout.setVerticalGroup(
            EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditQuizCongNgheLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditQuizCongNgheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13))
                .addGap(8, 8, 8)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(829, Short.MAX_VALUE))
        );

        content.add(EditQuizCongNghe, "EditQuizCongNgheCard");

        PreviewQuiz.setBackground(new java.awt.Color(255, 255, 255));
        PreviewQuiz.setPreferredSize(new java.awt.Dimension(1909, 1063));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel15, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel15.text")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel16, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel16.text")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel17, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel17.text")); // NOI18N

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton7, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton7.text")); // NOI18N

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(jButton8, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton8.text")); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel18, org.openide.util.NbBundle.getMessage(Main.class, "Main.jLabel18.text")); // NOI18N

        javax.swing.GroupLayout PreviewQuizLayout = new javax.swing.GroupLayout(PreviewQuiz);
        PreviewQuiz.setLayout(PreviewQuizLayout);
        PreviewQuizLayout.setHorizontalGroup(
            PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewQuizLayout.createSequentialGroup()
                .addGroup(PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreviewQuizLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton7)
                        .addGap(134, 134, 134)
                        .addComponent(jButton8))
                    .addGroup(PreviewQuizLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel15))
                    .addGroup(PreviewQuizLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)))
                    .addGroup(PreviewQuizLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(631, Short.MAX_VALUE))
        );
        PreviewQuizLayout.setVerticalGroup(
            PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreviewQuizLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PreviewQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(732, Short.MAX_VALUE))
        );

        content.add(PreviewQuiz, "PreviewQuiz");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        AddingANewQuizView a;
        a= new AddingANewQuizView();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_turnEditingButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        CardLayout contentLayout = (CardLayout) (content.getLayout());
        contentLayout.show(content, "CongNgheViewCard");
                
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        CardLayout contentLayout = (CardLayout) (content.getLayout());
        contentLayout.show(content, "EditQuizCongNgheCard");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout contentLayout = (CardLayout) (content.getLayout());
        contentLayout.show(content,"PreviewQuiz");
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
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
    private javax.swing.JPanel CongNgheView;
    private javax.swing.JPanel EditQuizCongNghe;
    private javax.swing.JPanel PreviewQuiz;
    private components.AddCategory addCategory1;
    private javax.swing.JPanel bg;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JPanel categoryTab;
    private javax.swing.JPanel content;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JPanel exportTab;
    private components.ImportFile importFile1;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JPanel importTab;
    private javax.swing.JLabel itLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel listQuiz;
    private javax.swing.JPanel mainContent;
    private javax.swing.JTabbedPane menuContent;
    private javax.swing.JPanel page;
    private javax.swing.JLabel pageLink;
    private components.QuestionBank questionBank1;
    private javax.swing.JMenuItem questionMenuItem;
    private javax.swing.JPanel questionTab;
    private javax.swing.JButton settingButton;
    private javax.swing.JPopupMenu settingMenu;
    private javax.swing.JPanel topbar;
    private javax.swing.JButton turnEditingButton;
    // End of variables declaration//GEN-END:variables
     
}
