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
    private JButton butIgu;
    private JButton butMult;
    private JButton but6;
    private JButton butMul2;
    private JButton but8;
    private JButton but9;
    private JButton button13;
    private JButton butFib;
    private JPanel panelMain;
    private JButton butAC;
    private JButton butSum;

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
        butAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("");
                text = "";
            }
        });
        butSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                option = 1;
                operand = Double.parseDouble(textField1.getText());
                text = "";
                textField1.setText("");
            }
        });

        butIgu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operand = Double.parseDouble(textField1.getText());

                textField1.setText("");
                switch (option){
                    case 1:
                        result = operand + operand;
                        textField1.setText(result.toString());
                        break;
                    case 2:
                        for (int i = 1; 1< 200; i++){
                            if (1%1==0){
                                text=text+1;
                            }
                        }
                        JOptionPane.showMessageDialog(null,* text);
                        //result = operand * operand;
                        //textField1.setText(result.toString());
                        //break;
                }
            }
        });
        butMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                option = 2;
                operand = Double.parseDouble(textField1.getText());
                text = "";
                textField1.setText("");
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
