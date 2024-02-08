package moneyger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moneyger extends JFrame {
    private JPanel currentPanel;

    public Moneyger() {
        setTitle("Main Frame");
        setSize(1080, 725);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Default frame
        currentPanel = new OpenWindow(this);
        getContentPane().add(currentPanel);
        
        // Center the frame
        setLocationRelativeTo(null);
    }

    public void navigateTo(JPanel newPanel) {
        getContentPane().remove(currentPanel);
        currentPanel = newPanel;
        getContentPane().add(currentPanel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Moneyger().setVisible(true);
               
            }
        });
    }
}
