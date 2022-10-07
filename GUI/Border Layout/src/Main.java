import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.GRAY);
        panel3.setBackground(Color.ORANGE);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.CYAN);

        panel1.setPreferredSize(new Dimension(80,80));
        panel2.setPreferredSize(new Dimension(80,80));
        panel3.setPreferredSize(new Dimension(80,80));
        panel4.setPreferredSize(new Dimension(80,80));
        panel5.setPreferredSize(new Dimension(80,80));

        frame.add(panel1, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);
    }
}