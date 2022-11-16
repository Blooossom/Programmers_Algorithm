package test21_30;

public class Test22 {
    public static void main(String[] args) {
        String input = "1234";
        String input1="-1234";
        System.out.println(solution(input1));
        System.out.println(solution(input));
    }
    public static int solution(String s){
        return s.charAt(0)=='-'? Integer.parseInt(s.substring(1))*-1:Integer.parseInt(s);
    }
}
