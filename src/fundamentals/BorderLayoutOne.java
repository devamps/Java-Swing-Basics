package fundamentals;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutOne extends JFrame { //decision window using BorderLayout

    public BorderLayoutOne() {

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        JLabel questionLabel = new JLabel("WHAT IS YOUR CHOICE", JLabel.CENTER);
        JButton blueButton = new JButton("BLUE");
        JLabel middleLabel = new JLabel("OR", JLabel.CENTER);
        JButton redButton = new JButton("RED");

        questionLabel.setFont(new Font("Dialog", Font.BOLD, 20));
        blueButton.setBackground(Color.CYAN);
        middleLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        redButton.setBackground(Color.RED);

        blueButton.addActionListener(e -> {
            blueButton.setBackground(Color.GREEN);
            redButton.setBackground(Color.WHITE);
            jPanel.setBackground(Color.CYAN);
        });

        redButton.addActionListener(e -> {
            redButton.setBackground(Color.GREEN);
            blueButton.setBackground(Color.WHITE);
            jPanel.setBackground(Color.RED);
        });

        jPanel.add(questionLabel, BorderLayout.PAGE_START);
        jPanel.add(blueButton, BorderLayout.LINE_START);
        jPanel.add(middleLabel, BorderLayout.CENTER);
        jPanel.add(redButton, BorderLayout.LINE_END);

        jPanel.setBackground(Color.WHITE);
        add(jPanel);
        setSize(250, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
