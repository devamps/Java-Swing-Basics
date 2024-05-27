package fundamentals;

import javax.swing.*;
import java.awt.*;

public class IButtonFrame extends JFrame { //traffic lights using JButton

    public IButtonFrame() {

        JButton button = new JButton("Press to start traffic.");

        button.addActionListener(e -> {

            button.setText("GREEN!");

            if (button.getBackground() == Color.GREEN) {
                button.setBackground(Color.RED);
                button.setText("RED!");
            } else {
                button.setBackground(Color.GREEN);
                button.setText("GREEN!");
            }
        });

        button.setToolTipText("Button");

        add(button);
        pack();
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
