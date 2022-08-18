import javax.swing.JOptionPane;
//GUI class
public class Main {
public static void main (String[] args){
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello " + name);
}    
}  