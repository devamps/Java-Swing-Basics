package fundamentals;

import javax.swing.*;
import java.awt.*;

public class JTwoFrame extends JFrame { //draw smiley using fillRect()

    public JTwoFrame() {

        int width = 25;
        int height = 25;

        int[][] blackRect = {
                {150, 50}, {175, 50}, {125, 75}, {300, 50}, {325, 50}, {350, 75}, //eyebrows
                {175, 175}, {175, 200}, {300, 175}, {300, 200}, //pupils
                {125, 325}, {150, 350}, {175, 375}, {200, 375}, {225, 375}, {250, 375}, {275, 375}, {300, 375}, {325, 350}, {350, 325} //mouth
        };

        int[][] whiteRect = {
                {125, 150}, {125, 175}, {125, 200}, {150, 125}, {150, 150}, {150, 175}, {150, 200},
                {150, 225}, {175, 125}, {175, 150}, {175, 225}, {200, 150}, {200, 175}, {200,200},
                {275, 150}, {275, 175}, {275, 200}, {300, 125}, {300, 150}, {300, 225}, {325, 125},
                {325, 150}, {325, 175}, {325, 200}, {325, 225}, {350, 150}, {350, 175}, {350, 200}, //eyeballs

        };

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.BLACK);

                for(int[] rect : blackRect) {
                    g.fillRect(rect[0],rect[1], width, height);
                }

                g.setColor(Color.WHITE);

                for(int[] rect : whiteRect) {
                    g.fillRect(rect[0], rect[1], width, height);
                }
            }
        };

        panel.setBackground(Color.ORANGE);
        add(panel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
