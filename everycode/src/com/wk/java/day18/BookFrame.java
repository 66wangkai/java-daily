package com.wk.java.day18;

import javax.swing.*;
import java.awt.*;
import java.awt.print.Book;

/**
 * @ClassName BookFrame
 * @Description TODO
 * @Author wangkai
 * @Date 2020/11/7
 **/
public class BookFrame {
    private JPanel mainPanel ;
    private JButton button3;
    private JButton button4;
    private JButton centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel leftPanel;
    private JTextField BookNameField;
    private JTextField PriceField;
    private JButton 检查Button;
    private JLabel resultLable;
    private JTextField ISBNField;
    public BookFrame(){
        检查Button.addActionListener(e ->{
            //点击按钮需要做的逻辑
            System.out.println("click");
            String bookName = BookNameField.getText();
            Book book =
                    Book.builder().bookname(bookName).price(Integer.parseInt(price)).ISBN(ISBN).build();
            BookService bs = new BookServiceImpl();
            boolean b = false ;
            try {
                b = bs.checkPush(book);


            }catch (ISBNException | BookNameException | PriceException isbnException) {
                JOptionPane.showMessageDialog(null,"该书未上架!");
                resultLable.setText(book.getBookName() + "该书未上架！");


            }finally{
                BookNameField.setText("");
                PriceField.setText("");
                ISBNField.setText("");
            }


        });
        public static Void main(String[] args){
            JFrame frame = new JFrame("StudentFrame");
            frame.setContentPane(new BookFrame().mainPanel);
            Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Frame.SetSize(800,600);
            frame.setLocationRelativeTo(null);
            frame.serVisible;
        }


    }
}
