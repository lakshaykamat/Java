import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //creates  a frame
        JFrame frame = new JFrame();
        //sets the title of frame
        frame.setTitle("My 1st Jframe");
        frame.setResizable(false);
        //exit out the application deafult is Hide_ON_CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the width and height
        frame.setSize(500,500);
        //sets the visibility of frame
        frame.setVisible(true);

        //creates image icon
        ImageIcon imageIcon = new ImageIcon("gigachad.png");
        //sets image icon to frame
        frame.setIconImage(imageIcon.getImage());

        //sets background color you can use name,rgb and hex values
        frame.getContentPane().setBackground(new Color(0x606060));
    }
}