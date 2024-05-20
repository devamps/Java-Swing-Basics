package fundamentals;

import javax.swing.*;
import java.awt.*;

public class JOneFrame extends JFrame { //custom notepad

    public JOneFrame() {

        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jTextArea.setFont(new Font(Font.SERIF, Font.ITALIC, 25));
        jTextArea.setBackground(Color.BLACK);
        jTextArea.setForeground(Color.CYAN);

        add(jScrollPane);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
