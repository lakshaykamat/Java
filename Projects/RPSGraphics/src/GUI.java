import javax.swing.*;

public class GUI extends JFrame {
    GUI(){
        this.setSize(420,420); //sets size of a JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits on close
        this.setResizable(false); //can't resize the frame now
        this.setVisible(true); //frame is visible
    }
}
