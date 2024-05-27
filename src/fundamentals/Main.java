package fundamentals;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //SwingUtilities.invokeLater(() -> new JOneFrame());
        //SwingUtilities.invokeLater(JTwoFrame::new);
        //SwingUtilities.invokeLater(IButtonFrame::new);
        SwingUtilities.invokeLater(JCheckBoxFrame::new);

    }
}