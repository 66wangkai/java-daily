package com.wk.java.day19;

import javax.swing.*;

/**
 * @ClassName SwingLoginExample
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/8
 **/
public class SwingLoginExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Example");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);

    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("user:");
userLabel.setBounds(10, 20, 80, 25);
panel.add(userLabel);
JTextField userText = new JTextField(20);
userText.setBounds(100, 20, 165, 25);
panel.add(userText);
JLabel passwordLabel = new JLabel("Password:");
passwordLabel.setBounds(10, 50, 80, 25);
panel.add(passwordLabel);
JPasswordField passWordText = new JPasswordField(20);
passWordText.setBounds(100, 50, 165, 25);
panel.add(passWordText);
JButton loginButton = new JButton("login");
loginButton.setBounds(10, 80, 80,25);
panel.add(loginButton);

    }
}
