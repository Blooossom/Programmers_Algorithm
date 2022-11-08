public class Test21 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    public static String solution(int n){
        String answer= "";
        String input ="수박".repeat(5000);
        answer=input.substring(0,n);
        return answer;
    }
}
