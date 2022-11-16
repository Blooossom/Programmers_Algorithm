package test11_20;

public class Test16 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
    public static String solution(String s){
        String answer ="";
        int[] arr = new int[58];
        for (int i = 0; i <s.length(); i++) {
            arr[s.charAt(i)-65]++;
        }
        for (int i = arr.length; i >0; i--) {
            if(arr[i]!=0) {
                answer += (char) arr[arr.length - 1];
            }
        }
        return answer;
    }
}
