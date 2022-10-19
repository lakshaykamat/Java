import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization {

    Desrialization() throws IOException, ClassNotFoundException {
       UserInfo openingUserInfo = openingFile();
        System.out.println("User Name:\t"+openingUserInfo.getUsrName());
        System.out.println("User Age:\t"+openingUserInfo.getUsrAge());
        System.out.println("User Id:\t"+openingUserInfo.getUsrId());
        System.out.println("User Password:\t"+openingUserInfo.getUsrPass());
    }

    public UserInfo openingFile() throws IOException, ClassNotFoundException {
        UserInfo userInfo;
        FileInputStream fileInputStream = new FileInputStream("User_Details.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        userInfo = (UserInfo) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        return userInfo;
    }
}
