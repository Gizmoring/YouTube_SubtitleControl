import java.util.Scanner;

public class CreateAdmin {
    public static final String wellcomMessage = "[안내]관리자 아이디를 생성합니다.";
    public static final String createdUserIdMessage = "[안내] 사용하실 아이디를 입력하여 주세요.";
    public static final String createdUserPassWordMessage = "[안내] 사용하실 비밀번호를 입력하여 주세요.";
    public static Scanner sc = new Scanner(System.in);


    public String createdUserId() {
        System.out.println(wellcomMessage);
        System.out.println(createdUserIdMessage);
        String userId = sc.nextLine();
        System.out.printf("입력된 ID : %s 입니다.\n", userId);
        return userId;
    }

    public String createdUserPassWord() {
        System.out.println(createdUserPassWordMessage);
        String userPassword = sc.nextLine();
        System.out.printf("입력된 PassWord : %s 입니다.\n",userPassword);
        return userPassword;
    }
}

