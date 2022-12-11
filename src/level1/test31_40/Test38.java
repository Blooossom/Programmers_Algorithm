package level1.test31_40;

public class Test38 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        System.out.println(solution(arr));
    }
    public static String solution(int[] arr){
        String answer = "";
        int[] num = new int[arr.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = arr[i]/2;
        }
        for (int i = 1; i < num.length; i++) {
            answer = answer + Integer.toString(i).repeat(num[i]);
        }
        StringBuilder sb = new StringBuilder(answer);
        sb.append("0");
        sb.reverse();
        answer = answer + sb.toString();
        return answer;
    }
}
