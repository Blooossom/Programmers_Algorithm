package level0;

public class Test05 {
    public static void main(String[] args) {

    }
    public static int solution(int[]arr, int n){
        int answer = 0;
        int[] num = new int[1001];
        for (int i = 0; i <arr.length; i++) {
            num[arr[i]]++;
        }
        answer=num[n];
        return answer;
    }
}
