import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileClass {
    public static void main(String[] args) {
        try {
            File myfile = new File("filename.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}