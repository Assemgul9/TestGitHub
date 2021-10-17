package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {

    private int randomNumber;

    private JTextField textField;

    private int tryNumber;



    public GuessNumber() {


        randomNumber = (int)(Math.random() * 10) + 1; // [1 ; 10]

        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);



        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

                textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);





        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            tryNumber=1;
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(tryToAnswer(buttonIndex, button)&&tryNumber<=3) {
                       buttonsPanel.setVisible(false);



                    }


                   if(!tryToAnswer(buttonIndex,button)&&tryNumber>3){
                       tryToAnswer(buttonIndex,button);
                       buttonsPanel.setVisible(false);
                       textField.setText("Вы проиграли, количество попыток закончилось");
                        JButton newGameButton = new JButton("Играть заново?");
                        add(newGameButton, BorderLayout.CENTER);
                        newGameButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                new GuessNumber();
                                dispose();
                            }
                        });
                        setVisible(true);

                    } tryNumber+=1;
                }
            });

        }

        setVisible(true);
    }

    public boolean tryToAnswer(int answer, JButton button) {

            if (tryNumber<=3&&answer == randomNumber) {
                textField.setText("Вы угадали! Ответ: " + randomNumber);
                button.setBackground(Color.GREEN);
                JButton newGameButton = new JButton("Играть заново?");
                add(newGameButton, BorderLayout.CENTER);
                newGameButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new GuessNumber();
                        dispose();
                    }
                });
                setVisible(true);
                return true;


            } else if (tryNumber<=3&&answer > randomNumber) {
                textField.setText("Не угадали! Загаданное число меньше");
                return false;

            } else {
                textField.setText("Не угадали! Загада" +
                        "нное число больше");}
                return false;




    }



}