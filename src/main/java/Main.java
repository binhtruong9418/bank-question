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
        mainContent = new javax.swing.JPanel();
        menuContent = new javax.swing.JTabbedPane();
        questionTab = new javax.swing.JPanel();
        questionBank1 = new components.QuestionBank();
        categoryTab = new javax.swing.JPanel();
        addCategory1 = new components.AddCategory();
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

        javax.swing.GroupLayout questionTabLayout = new javax.swing.GroupLayout(questionTab);
        questionTab.setLayout(questionTabLayout);
        questionTabLayout.setHorizontalGroup(
            questionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionBank1, javax.swing.GroupLayout.DEFAULT_SIZE, 1930, Short.MAX_VALUE)
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
            .addComponent(addCategory1, javax.swing.GroupLayout.DEFAULT_SIZE, 1930, Short.MAX_VALUE)
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
        AddingANewQuizView addingANewQuizView = new AddingANewQuizView();
        addingANewQuizView.setVisible(true);
    }//GEN-LAST:event_turnEditingButtonActionPerformed

    
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
    private javax.swing.JLabel jLabel1;
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
