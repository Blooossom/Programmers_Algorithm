package level1.test21_30;

public class Test27 {
    public static void main(String[] args) {
        String[] arr = {"jane","Kim"};
        System.out.println(solution(arr));
    }
    public static String solution(String[] seoul){
        String answer ="";
        for (int i = 0; i <seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                answer="김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}
