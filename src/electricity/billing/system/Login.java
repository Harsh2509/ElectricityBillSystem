package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField userText, passwordText;
    Choice loginChoice;
    JButton loginButton, cancelButton, signupButton;

    Login(){

        super("Login");
        JLabel username = new JLabel("UserName");
        username.setBounds(300, 60, 100, 20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100,150,20);
        add(passwordText);

        JLabel loginAs = new JLabel("Log In As");
        loginAs.setBounds(300, 140, 100, 20);
        add(loginAs);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,150,20);
        add(loginChoice);


        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setBounds(338, 180, 100, 20);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        cancelButton.setBounds(460,180,100,20);
        add(cancelButton);

        signupButton = new JButton("Signup");
        signupButton.addActionListener(this);
        signupButton.setBounds(400, 215, 100, 20);
        add(signupButton);

        ImageIcon profileImage1 = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileTow = profileImage1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon profileImage2 = new ImageIcon(profileTow);
        JLabel profileLabel = new JLabel(profileImage2);
        profileLabel.setBounds(5,5,250,250);
        add(profileLabel);


        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton){

        }
        else if (e.getSource() == cancelButton){
            setVisible(false);
        }
        else if (e.getSource() == signupButton){
            setVisible(false);
            new Signup();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
