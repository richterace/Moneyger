/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package moneyger;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author PC
 */
public class OpenWindow extends javax.swing.JPanel {
    private Moneyger mainFrame;
    /**
     * Creates new form OpeningWindow_Frame
     */
    public OpenWindow(Moneyger mainFrame) {
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

        TwitterButton = new javax.swing.JButton();
        InstagramButton = new javax.swing.JButton();
        FacebookButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        LoginText = new javax.swing.JLabel();
        SignUpText = new javax.swing.JLabel();
        ContactUs = new javax.swing.JLabel();
        MoneygerSubTitle = new javax.swing.JLabel();
        MoneygerTitle = new javax.swing.JLabel();
        WhiteBG = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        BaseBG = new javax.swing.JLabel();

        setLayout(null);

        TwitterButton.setBorderPainted(false);
        TwitterButton.setContentAreaFilled(false);
        TwitterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwitterButtonActionPerformed(evt);
            }
        });
        add(TwitterButton);
        TwitterButton.setBounds(330, 490, 70, 60);

        InstagramButton.setBorderPainted(false);
        InstagramButton.setContentAreaFilled(false);
        InstagramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstagramButtonActionPerformed(evt);
            }
        });
        add(InstagramButton);
        InstagramButton.setBounds(175, 490, 60, 60);

        FacebookButton.setBorderPainted(false);
        FacebookButton.setContentAreaFilled(false);
        FacebookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookButtonActionPerformed(evt);
            }
        });
        add(FacebookButton);
        FacebookButton.setBounds(250, 490, 70, 60);

        LoginButton.setBorderPainted(false);
        LoginButton.setContentAreaFilled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        add(LoginButton);
        LoginButton.setBounds(170, 270, 230, 55);

        SignUpButton.setBorderPainted(false);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        add(SignUpButton);
        SignUpButton.setBounds(170, 350, 230, 55);

        LoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Buttonbtns.png"))); // NOI18N
        add(LoginText);
        LoginText.setBounds(175, 270, 225, 54);

        SignUpText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Group 1btns.png"))); // NOI18N
        add(SignUpText);
        SignUpText.setBounds(175, 350, 225, 54);

        ContactUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/New BG/Group 38.png"))); // NOI18N
        add(ContactUs);
        ContactUs.setBounds(170, 450, 240, 140);

        MoneygerSubTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Your financial manager.png"))); // NOI18N
        add(MoneygerSubTitle);
        MoneygerSubTitle.setBounds(190, 190, 200, 15);

        MoneygerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Moneyger.png"))); // NOI18N
        add(MoneygerTitle);
        MoneygerTitle.setBounds(175, 100, 240, 100);

        WhiteBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/white bg.png"))); // NOI18N
        add(WhiteBG);
        WhiteBG.setBounds(40, 40, 498, 614);

        Description.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Description.png"))); // NOI18N
        add(Description);
        Description.setBounds(605, 145, 400, 420);

        BaseBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyger/UI Elements/Opening Window/Rectangle.png"))); // NOI18N
        add(BaseBG);
        BaseBG.setBounds(0, 0, 1080, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void TwitterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwitterButtonActionPerformed
        String twitterLink = "https://twitter.com/moneyger_app";
        openSocialLink(twitterLink);
    }//GEN-LAST:event_TwitterButtonActionPerformed

    private void InstagramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramButtonActionPerformed
        String instagramLink = "https://www.instagram.com/moneyger.app/";
        openSocialLink(instagramLink);
    }//GEN-LAST:event_InstagramButtonActionPerformed

    private void FacebookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacebookButtonActionPerformed
        String facebookLink = "https://www.facebook.com/profile.php?id=61556103717072";
        openSocialLink(facebookLink);
    }//GEN-LAST:event_FacebookButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
     mainFrame.navigateTo(new Login(mainFrame));
    }//GEN-LAST:event_LoginButtonActionPerformed
    private void openSocialLink(String link) {
        try {
            // Check if the Desktop class is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Create a URI object from the link
                URI uri = new URI(link);

                // Open the link in the default web browser
                desktop.browse(uri);
            } else {
                System.out.println("Desktop not supported. Cannot open Instagram link.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error opening Social link: " + e.getMessage());
        }
    }
    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed

        mainFrame.navigateTo(new SignUp(mainFrame));

    }//GEN-LAST:event_SignUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BaseBG;
    private javax.swing.JLabel ContactUs;
    private javax.swing.JLabel Description;
    private javax.swing.JButton FacebookButton;
    private javax.swing.JButton InstagramButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel MoneygerSubTitle;
    private javax.swing.JLabel MoneygerTitle;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpText;
    private javax.swing.JButton TwitterButton;
    private javax.swing.JLabel WhiteBG;
    // End of variables declaration//GEN-END:variables
}
