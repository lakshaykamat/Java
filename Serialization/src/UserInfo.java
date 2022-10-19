import java.io.Serializable;

public class UserInfo implements Serializable {
    String usrName,usrId,usrPass;
    int usrAge;
    UserInfo(String usrName,int usrAge,String usrId,String usrPass){
        setUsrName(usrName);
        setUsrAge(usrAge);
        setUsrId(usrId);
        setUsrPass(usrPass);
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public int getUsrAge() {
        return usrAge;
    }

    public void setUsrAge(int usrAge) {
        this.usrAge = usrAge;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrPass() {
        return usrPass;
    }

    public void setUsrPass(String usrPass) {
        this.usrPass = usrPass;
    }
}
