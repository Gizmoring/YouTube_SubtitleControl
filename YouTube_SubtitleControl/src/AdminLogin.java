import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class AdminLogin {

    public static final String InputUserIdMessage = "[시스템] 유투브 계정의 아이디를 입력하여주세요.";
    public static final String InputPasswordMessage = "[시스템] 유투브 계정의 비밀번호를 입력하여주세요.";
    public static final String errorPassWordMessage = "[경고] 유튜브 계정의 비밀번호를 확인해 주세요.";
    public static final String logInMessage = "[안내] 로그인되었습니다";

    public static Scanner sc = new Scanner(System.in);

    public static boolean adminLogin(HashMap<String, String> adminAccount) {
        boolean login = false;
        System.out.println(InputUserIdMessage);
        String userId = sc.nextLine();
        if (adminAccount.containsKey(userId)) {
            System.out.println(InputPasswordMessage);
            String userPassWord = sc.nextLine();
            if (Objects.equals(adminAccount.get(userId), userPassWord)) {
                System.out.println(logInMessage);
                login = true;
            } else if (!(Objects.equals(adminAccount.get(userId), userPassWord))) {
                System.out.println(errorPassWordMessage);
                return login;
            }
        }
        return login;
    }

//    public static String subtitleControl(String subtitle){
//        System.out.printf("%s",subtitle);
//    }

}
