/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package moneyger;

/**
 *
 * @author PC
 */
public class WhatsNew extends javax.swing.JPanel {
    private Moneyger mainFrame;
    /**
     * Creates new form NEW
     */
    public WhatsNew(Moneyger mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Profile = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ExpenseTrackingButton = new javax.swing.JButton();
        DashboardButton = new javax.swing.JButton();
        Updates = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        IncomeTrackingButton = new javax.swing.JButton();
        GoalsAndReminders = new javax.swing.JButton();
        WhatsNewButton = new javax.swing.JButton();
        GreenBG = new javax.swing.JLabel();
        SideMenu = new javax.swing.JLabel();
        WhiteBG = new javax.swing.JLabel();
        BaseBG = new javax.swing.JLabel();

        setLayout(null);

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/New BG/Group 39.png"))); // NOI18N
        add(Profile);
        Profile.setBounds(110, 100, 140, 136);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/HomeDashboard/Logoutt.png"))); // NOI18N
        add(Logout);
        Logout.setBounds(390, 240, 440, 173);
        Logout.setVisible(false);

        ExpenseTrackingButton.setBorderPainted(false);
        ExpenseTrackingButton.setContentAreaFilled(false);
        ExpenseTrackingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenseTrackingButtonActionPerformed(evt);
            }
        });
        add(ExpenseTrackingButton);
        ExpenseTrackingButton.setBounds(110, 350, 150, 30);

        DashboardButton.setBorderPainted(false);
        DashboardButton.setContentAreaFilled(false);
        DashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardButtonActionPerformed(evt);
            }
        });
        add(DashboardButton);
        DashboardButton.setBounds(130, 300, 110, 30);

        Updates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/New BG/Group 40.png"))); // NOI18N
        add(Updates);
        Updates.setBounds(420, 180, 480, 370);

        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        add(LogoutButton);
        LogoutButton.setBounds(130, 540, 100, 40);

        noButton.setBorderPainted(false);
        noButton.setContentAreaFilled(false);
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        add(noButton);
        noButton.setBounds(660, 340, 70, 40);
        noButton.setVisible(false);

        yesButton.setBorderPainted(false);
        yesButton.setContentAreaFilled(false);
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        add(yesButton);
        yesButton.setBounds(500, 340, 70, 40);
        yesButton.setVisible(false);

        IncomeTrackingButton.setBorderPainted(false);
        IncomeTrackingButton.setContentAreaFilled(false);
        IncomeTrackingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeTrackingButtonActionPerformed(evt);
            }
        });
        add(IncomeTrackingButton);
        IncomeTrackingButton.setBounds(110, 390, 150, 30);

        GoalsAndReminders.setBorderPainted(false);
        GoalsAndReminders.setContentAreaFilled(false);
        GoalsAndReminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoalsAndRemindersActionPerformed(evt);
            }
        });
        add(GoalsAndReminders);
        GoalsAndReminders.setBounds(90, 430, 190, 40);

        WhatsNewButton.setBorderPainted(false);
        WhatsNewButton.setContentAreaFilled(false);
        WhatsNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhatsNewButtonActionPerformed(evt);
            }
        });
        add(WhatsNewButton);
        WhatsNewButton.setBounds(120, 490, 130, 40);

        GreenBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/WhatsNew/Group 24.png"))); // NOI18N
        add(GreenBG);
        GreenBG.setBounds(370, 95, 554, 491);

        SideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/New BG/Group 33.png"))); // NOI18N
        add(SideMenu);
        SideMenu.setBounds(80, 70, 210, 541);

        WhiteBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/GoalsAndReminders/whitebg.png"))); // NOI18N
        add(WhiteBG);
        WhiteBG.setBounds(45, 40, 983, 614);

        BaseBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/GoalsAndReminders/Rectangle.png"))); // NOI18N
        add(BaseBG);
        BaseBG.setBounds(0, 0, 1080, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void ExpenseTrackingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenseTrackingButtonActionPerformed
        mainFrame.navigateTo(new ExpenseTracking(mainFrame));
    }//GEN-LAST:event_ExpenseTrackingButtonActionPerformed

    private void DashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardButtonActionPerformed
        mainFrame.navigateTo(new HomeDashboard(mainFrame));
    }//GEN-LAST:event_DashboardButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        Logout.setVisible(false);
        yesButton.setVisible(false);
        noButton.setVisible(false);
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        mainFrame.navigateTo(new OpenWindow(mainFrame));
    }//GEN-LAST:event_yesButtonActionPerformed

    private void IncomeTrackingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeTrackingButtonActionPerformed
        mainFrame.navigateTo(new IncomeTracking(mainFrame));
    }//GEN-LAST:event_IncomeTrackingButtonActionPerformed

    private void GoalsAndRemindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoalsAndRemindersActionPerformed
        mainFrame.navigateTo(new GoalsAndReminders(mainFrame));
    }//GEN-LAST:event_GoalsAndRemindersActionPerformed

    private void WhatsNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhatsNewButtonActionPerformed
        mainFrame.navigateTo(new WhatsNew(mainFrame));
    }//GEN-LAST:event_WhatsNewButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        Logout.setVisible(!Logout.isVisible());
        yesButton.setVisible(!yesButton.isVisible());
        noButton.setVisible(!noButton.isVisible());
    }//GEN-LAST:event_LogoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BaseBG;
    private javax.swing.JButton DashboardButton;
    private javax.swing.JButton ExpenseTrackingButton;
    private javax.swing.JButton GoalsAndReminders;
    private javax.swing.JLabel GreenBG;
    private javax.swing.JButton IncomeTrackingButton;
    public javax.swing.JLabel Logout;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel SideMenu;
    private javax.swing.JLabel Updates;
    private javax.swing.JButton WhatsNewButton;
    private javax.swing.JLabel WhiteBG;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
