import java.awt.*;
import javax.swing.*;

public class GridLayoutEx2 extends JFrame {
    public GridLayoutEx2(String title) {
        super(title);
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));

        Container c = getContentPane();
        c.add(new JLabel("Name"));
        c.add(new JTextField(""));
        c.add(new JLabel("Student ID"));
        c.add(new JTextField(""));
        c.add(new JLabel("Major"));
        c.add(new JTextField(""));
        c.add(new JLabel("Subject"));
        c.add(new JTextField(""));

        setVisible(true);
    }

    public static void main(String[] argc) {
        new GridLayoutEx2("GridLayout2");
    }
}