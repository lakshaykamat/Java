import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to

        JFrame jFrame = new JFrame();//new frame object
        jFrame.setSize(420,420); //sets size of a JFrame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits on close
        jFrame.setResizable(false); //can't resize the frame now
        jFrame.setVisible(true); //frame is visible

        ImageIcon imageIcon = new ImageIcon("logo.jpg");//image icon object
        jFrame.setIconImage(imageIcon.getImage()); //setting image icon
        jFrame.getContentPane().setBackground(Color.cyan); //setting background color
    }
}