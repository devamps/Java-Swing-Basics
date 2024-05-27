package fundamentals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class JCheckBoxFrame extends JFrame { //dynamic checkbox about weather using JCheckBox

    public JCheckBoxFrame() {

        JCheckBox jCheckBox1 = new JCheckBox("It is sunny!");
        JCheckBox jCheckBox2 = new JCheckBox("It is raining.");
        JCheckBox jCheckBox3 = new JCheckBox("It is storming!");
        JCheckBox jCheckBox4 = new JCheckBox("It is windy.");
        JCheckBox jCheckBox5 = new JCheckBox("It is snowing!");

        ItemListener itemListener = e -> {
            Object source = e.getItemSelectable();

            if (source == jCheckBox1) {
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox5.setSelected(false);
            } else if (source == jCheckBox2) {
                jCheckBox1.setSelected(false);
                jCheckBox5.setSelected(false);
            } else if (source == jCheckBox3) {
                jCheckBox1.setSelected(false);
                jCheckBox5.setSelected(false);
            } else if (source == jCheckBox5) {
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
            }
        };

        jCheckBox1.addItemListener(itemListener);
        jCheckBox2.addItemListener(itemListener);
        jCheckBox3.addItemListener(itemListener);
        jCheckBox4.addItemListener(itemListener);
        jCheckBox5.addItemListener(itemListener);

        setLayout(new FlowLayout());

        add(jCheckBox1);
        add(jCheckBox2);
        add(jCheckBox3);
        add(jCheckBox4);
        add(jCheckBox5);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
