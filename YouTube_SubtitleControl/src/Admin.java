import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    private static HashMap<String, String> adminAccount = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    //    hashmap 관리자를 관리할것이고 id를 키로, 비밀번호가 value hashmap 으로 관리할 것이다.
    public static HashMap<String, String> CreatedAdminAccount(String userId, String passWord) {
        adminAccount.put(userId, passWord);
        return adminAccount;
    }
}

