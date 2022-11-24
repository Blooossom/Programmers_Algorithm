package level0;

public class Test06 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(arr));
    }
    public static double solution(int[] arr){
        double answer = 0;
        int div = arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

            answer = (sum/div);

        return answer;
    }
}
