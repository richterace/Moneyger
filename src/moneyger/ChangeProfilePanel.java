/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneyger;

import javax.swing.*;

public class ChangeProfilePanel extends JPanel {
    private Moneyger mainFrame;

    public ChangeProfilePanel(Moneyger mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(null);

        JLabel nameLabel = new JLabel("Enter new username:");
        nameLabel.setBounds(100, 100, 200, 25);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(100, 130, 200, 30);
        add(nameField);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100, 180, 100, 30);
        add(saveButton);

        saveButton.addActionListener(e -> {
            String newName = nameField.getText().trim();
            if (!newName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Profile updated to: " + newName);
                mainFrame.navigateTo(new HomeDashboard(mainFrame));
            } else {
                JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(210, 180, 100, 30);
        add(cancelButton);

        cancelButton.addActionListener(e -> {
            mainFrame.navigateTo(new HomeDashboard(mainFrame));
        });
    }
}
