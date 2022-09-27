import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("userPassword:");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> loginInfo = new HashMap<String, String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){
        this.loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(40,150,100,25);

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener((ActionListener) this);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC, 25));


        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userPasswordField);
        frame.add(userIDField);
        frame.add(messageLabel);
        frame.add(userPasswordLabel);
        frame.add(userIdLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }if(e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

                if(loginInfo.containsKey(userID)){
                    if(loginInfo.get(userID).equals(password)){
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login Successful");
                        frame.dispose();
                        WelcomePage welcomePage = new WelcomePage(userID);
                    }
                    else {
                        messageLabel.setForeground(Color.red);
                        messageLabel.setText("Wrong Password");
                    }
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("username not found");
                }
        }

    }
}
