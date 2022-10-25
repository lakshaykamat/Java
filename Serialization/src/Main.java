import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int getFile;
        String usrName,usrId,usrPass;
        int usrAge;
        System.out.print("Enter Your Name: ");
        usrName = scanner.nextLine();
        System.out.print("Enter Your Age: ");
        usrAge = scanner.nextInt();
        System.out.print("Enter Your User Id: ");
        usrId = scanner.next();
        System.out.print("Enter Your User Password: ");
        usrPass = scanner.next();


        UserInfo userInfo = new UserInfo(usrName,usrAge,usrId,usrPass);//creating object
        savingFile(userInfo);//saving file function
        System.out.println("Your Details Saved!");
        System.out.print("Press 1 to Get details: ");
        getFile = scanner.nextInt();
        scanner.close();
        if (getFile == 1){
            new Desrialization();
        }else{
            System.out.println("Okay...");
        }
    }
    public static void savingFile(UserInfo userInfo) throws IOException {//Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("User_Details.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(userInfo);
        outputStream.close();
        fileOutputStream.close();
    }
}