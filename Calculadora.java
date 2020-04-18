import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textField1;
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    private JButton but7;
    private JButton but0;
    private JButton button8;
    private JButton button9;
    private JButton but6;
    private JButton button10;
    private JButton but8;
    private JButton but9;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JPanel panelMain;

    private Double operand;
    private Double operator;
    private Integer option;
    private Double result;
    private String text;


    public Calculadora() {
        text = "";
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but1.getText();
                textField1.setText(text);
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but2.getText();
                textField1.setText(text);
            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but3.getText();
                textField1.setText(text);
            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but4.getText();
                textField1.setText(text);
            }
        });
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but5.getText();
                textField1.setText(text);
            }
        });
        but6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but6.getText();
                textField1.setText(text);
            }
        });
        but7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but7.getText();
                textField1.setText(text);
            }
        });
        but8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but8.getText();
                textField1.setText(text);
            }
        });
        but9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but9.getText();
                textField1.setText(text);
            }
        });
        but0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text += but0.getText();
                textField1.setText(text);
            }
        });
    }

    public static void main(String[] args) {
            JFrame frame = new JFrame("Calculadora.form");
           frame.setContentPane(new Calculadora().panelMain);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }


    }
