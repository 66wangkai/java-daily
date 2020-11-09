package com.wk.java.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName studentsFrame
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/9
 **/
public class studentsFrame {
    private JPanel mainPanel;
    private JButton button3;
    private JButton button4;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel leftPanel;
    private JButton 检查Button;
    private JTextField nameField;
    private JTextField weightField;


    public studentsFrame() {
        检查Button.addActionListener(actionEvent -> {

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("studentsFrame");
        frame.setContentPane(new studentsFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
