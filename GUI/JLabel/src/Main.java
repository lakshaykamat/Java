import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel jLabel = new JLabel();//creates a label
        jLabel.setText("Lakshay Kamat");//set text of label
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setForeground(Color.BLUE);
        jLabel.setBackground(Color.YELLOW);
        jLabel.setOpaque(true);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(430,430);
        jFrame.setVisible(true);
        jFrame.add(jLabel);//adding label to JFrame


    }
}