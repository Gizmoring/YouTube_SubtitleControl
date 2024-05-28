import java.util.*;

public class Main {
    public static void main(String[] args) {
        ChangeWord changeWord = new ChangeWord();
        Scanner sc = new Scanner(System.in);
        String subtitle;
        String userId;
        String passWord;
        CreateAdmin createdAdmin = new CreateAdmin();
        HashMap<String, String> adminAccount = new HashMap<>();
        int boolean1 = -1;
        boolean validation = false;
//        객체를 생성할 때마다 다른 유저로 만들기 위해 admin 객체를 생성하고 각각 id,passWord를 문자열로 저장해둔다.

        userId = createdAdmin.createdUserId();
        passWord = createdAdmin.createdUserPassWord();
        adminAccount = Admin.CreatedAdminAccount(userId, passWord);
        
        while (!validation) {
            validation = AdminLogin.adminLogin(adminAccount);
        }
        ;
//        System.out.printf("[안내] 안녕하세요 %s님.\n",userId);
        System.out.println("[안내] 유투브 영상의 자막을 생성해 주세요.");
        subtitle = sc.nextLine();
        System.out.println("==".repeat(30));
        System.out.println("[알림] 프로그램 금칙어 리스트입니다.");
        changeWord.forbiddenWordPrint();
        System.out.println("==".repeat(30));
        changeWord.changeSubtitle(subtitle);
        System.out.println("[안내] 프로그램을 종료합니다.");



    }

}
//        입력받아서 자막을 생성한걸 담아주는 subtitle 변수를 선언해뒀음
//        여기까지 실행됐을 때 입력한 id , 비밀번호가 adminAccount 객체에 저장이 된다. 그리고 메서드를 실행할거임 .
//        해당하는 키에 값이 없을때 - 아이디가 중복이지 않을 때 까지 돌거다.
//        adminAccount = Admin.CreatedAdminAccount(userId, passWord);
//        System.out.println(adminAccount);
