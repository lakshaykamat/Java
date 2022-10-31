import javax.swing.*;
public class myFrame extends JFrame {
    JButton button;
    myFrame(){
        button = new JButton();
        button.setText("The Button");
        button.setBounds(200,100,150,40);
        button.setFocusable(false);
        button.addActionListener(e->System.out.println("You Clicked the button"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
