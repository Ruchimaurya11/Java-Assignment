// o Create a simple Swing GUI with input fields for id, fname, lname, and email

package Assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class R10_1Swing_gui {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 20, 80, 25);
        panel.add(idLabel);
        
        JTextField idText = new JTextField(20);
        idText.setBounds(100, 20, 165, 25);
        panel.add(idText);

        JLabel fnameLabel = new JLabel("First Name:");
        fnameLabel.setBounds(10, 50, 80, 25);
        panel.add(fnameLabel);
        
        JTextField fnameText = new JTextField(20);
        fnameText.setBounds(100, 50, 165, 25);
        panel.add(fnameText);

        JLabel lnameLabel = new JLabel("Last Name:");
        lnameLabel.setBounds(10, 80, 80, 25);
        panel.add(lnameLabel);
        
        JTextField lnameText = new JTextField(20);
        lnameText.setBounds(100, 80, 165, 25);
        panel.add(lnameText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 110, 80, 25);
        panel.add(emailLabel);
        
        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 110, 165, 25);
        panel.add(emailText);

        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 150, 80, 25);
        panel.add(submitButton);

     
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String id = idText.getText();
                String fname = fnameText.getText();
                String lname = lnameText.getText();
                String email = emailText.getText();

                
                JOptionPane.showMessageDialog(panel,
                    "ID: " + id + "\nFirst Name: " + fname + "\nLast Name: " + lname + "\nEmail: " + email,
                    "Submitted Information",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
