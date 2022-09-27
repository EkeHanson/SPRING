
import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> loginInfo = new HashMap<String, String>();
    IDandPasswords(){
        loginInfo.put("bro", "Hanson");
        loginInfo.put("sis", "Blessing");
        loginInfo.put("dad", "Abraham");
        loginInfo.put("mum", "Elizabeth");
        loginInfo.put("luv", "Belejit");

    }
    protected HashMap<String, String> getLoginInfo() {

        return loginInfo;
    }
}
