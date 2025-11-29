package lab12;

import javax.swing.*;
import java.awt.event.*;

public class lab12 extends JFrame {
    private JTextField jTextFieldX1; //* Перший x
    private JTextField jTextFieldX2; //* Другий x
    private JTextField jTextFieldY1; //* Перший у
    private JTextField jTextFieldY2; //* Другий у
    private JTextField jTextFieldResult; //* Результат
    private JButton btnClear, btnExit, btnEquals;
    private JLabel labelX1, labelX2, labelY1, labelY2;

    public lab12() {
        super("Обчислення відстані між точками");
        setSize(500, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        //todo ------ Поля введення -------
        //? Поля введення X1
        jTextFieldX1 = new JTextField();
        jTextFieldX1.setBounds(30, 30, 80, 30);
        add(jTextFieldX1);

        //? Поле введення X2
        jTextFieldX2 = new JTextField();
        jTextFieldX2.setBounds(30, 80, 80, 30);
        add(jTextFieldX2);

        //? Поле введення Y1
        jTextFieldY1 = new JTextField();
        jTextFieldY1.setBounds(140, 30, 80, 30);
        add(jTextFieldY1);

        //? Поле введення Y1
        jTextFieldY2 = new JTextField();
        jTextFieldY2.setBounds(140, 80, 80, 30);
        add(jTextFieldY2);
        
        //? Поле результату
        jTextFieldResult = new JTextField();
        jTextFieldResult.setBounds(300, 55, 120, 40);
        jTextFieldResult.setEditable(false);
        add(jTextFieldResult);
        

        //todo -------- Надписи -----------

        //? Надпис Х1
        labelX1 = new JLabel("X₁");
        labelX1.setBounds(10, 30, 20, 30);
        add(labelX1);

        //? Надпис Х2
        labelX2 = new JLabel("X₂");
        labelX2.setBounds(10, 80, 20, 30);
        add(labelX2);

        //? Надпис Y1
        labelY1 = new JLabel("Y₁");
        labelY1.setBounds(120, 30, 20, 30);
        add(labelY1);


        //? Надпис Y2
        labelY2 = new JLabel("Y₂");
        labelY2.setBounds(120, 80, 20, 30);
        add(labelY2);



        //todo --------- Кнопки -----------
        //? Кнопка "C" (Clear)
        btnClear = new JButton("C");
        btnClear.setBounds(20, 130, 50, 50);
        add(btnClear);

        //? Кнопка рівності
        btnEquals = new JButton("=");
        btnEquals.setBounds(240, 45, 50, 50);
        add(btnEquals);

        //? Кнопка "Вихід"
        btnExit = new JButton("Вихід");
        btnExit.setBounds(405, 210, 80, 30);
        add(btnExit);

        //todo --------- Задавання логіки -----------
        //? Логіка кнопки рівності
        btnEquals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try{
                    String x1 = jTextFieldX1.getText();
                    String x2 = jTextFieldX2.getText();
                    String y1 = jTextFieldY1.getText();
                    String y2 = jTextFieldY2.getText();

                    double x1f = Double.parseDouble(x1.replace(",", "."));
                    double x2f = Double.parseDouble(x2.replace(",", "."));
                    double y1f = Double.parseDouble(y1.replace(",", "."));
                    double y2f = Double.parseDouble(y2.replace(",", "."));


                    double result = Math.sqrt(Math.pow((x2f-x1f), 2) + Math.pow((y2f-y1f), 2));
                    String FormatedResult = String.format("%.2f", result);
                    //jTextFieldResult.setText("Hello world!");
                    jTextFieldResult.setText(FormatedResult);
                }
                catch (NumberFormatException e){
                    jTextFieldResult.setText("Помилка");
                    JOptionPane.showMessageDialog(null, "Введіть коректні числа!");
                }
            }
        });


        //? Логіка кнопки "C" (Clear)
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextFieldX1.setText("");
                jTextFieldX2.setText("");
                jTextFieldY1.setText("");
                jTextFieldY2.setText("");
                jTextFieldResult.setText("");

            }
        });

        //? Логіка кнопки вихід
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        
        //? Розміщення вікна по центру
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lab12();
    }
}
