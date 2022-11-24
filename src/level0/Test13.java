package level0;

public class Test13 {
    public static void main(String[] args) {
        String str = "pfqallllabwaoclk";
        System.out.println(solution(str, 2));
    }
    public static String solution(String cipher, int code){
        String answer = "";
        for (int i = 1; i <=cipher.length()/code ; i++) {
            answer = answer+cipher.substring(i*code-1,i*code);
        }
        return answer;
    }
}
