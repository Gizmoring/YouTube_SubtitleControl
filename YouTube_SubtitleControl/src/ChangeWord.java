import java.util.Arrays;
import java.util.HashMap;
//객체를 만들 때 내가 미리 넣어둔 값의 맵을 반환해주는 클래스.
public class ChangeWord {
    private final String[] forbiddenWordList =
            {"킹","씨발","시발","꺼져","꺼저","미친"};

    public String[] getForbiddenWordList() {
        return forbiddenWordList;
    }

    private HashMap<String, String> changeWordMap;

    public HashMap<String, String> getChangeWordList() {
        return changeWordMap;
    }

    public void setChangeWordList(HashMap<String, String> changeWordList) {
        this.changeWordMap = changeWordList;
    }

    public ChangeWord() {
        this.changeWordMap = new HashMap<>();
        changeWordMap.put("킹", "열");
        changeWordMap.put("씨발", "사랑");
        changeWordMap.put("꺼저", "안돼");
        changeWordMap.put("미친", "정말");
        changeWordMap.put("꺼져", "사라져");
        changeWordMap.put("시발", "사랑해");
    }

    public void changeSubtitle(String subtitle){

        String changedSubtitle = subtitle;
        for(int i = 0; i < forbiddenWordList.length; i++){
            String forbiddenWord = forbiddenWordList[i];
            String changeWord = changeWordMap.get(forbiddenWordList[i]);
            if(changeWord != null){
                changedSubtitle = changedSubtitle.replaceAll(forbiddenWord,changeWord);
            }
        }
        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
        System.out.printf(">>> %s \n",changedSubtitle);
    }

    public void forbiddenWordPrint(){
        System.out.println(Arrays.toString(forbiddenWordList));
    }
}




//금칙어 리스트 배열을 만들어 놓고
//문자열이 들어왔을 때 순회하면서 wordList[i]가 포함하는지 확인하고 포함한다면 해당하는 인덱스를 반환하고
//변환시킬 금칙어리스트 맵에 wordList[i]을 키값으로 바꿀 닉네임을 벨류값으로 해두고
//subtitle.replaceAll(금지워드 = 루프하면서 찾은 배열에 인덱스 ,바꿀워드= 맵에 키값에 넣어준 벨류) 로 변환시켜줄거고 그걸 스트링에 담아서 반환하는 메서드를 만들거얌
//그리고 이걸 갱신하면서 변수에 대입해야하니까