package level0;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(solution(numbers,num1,num2));
    }
    public static ArrayList<Integer> solution(int[] arr, int num1, int num2){
        int size = num2-num1+1;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = num1; i <=num2; i++) {
            answer.add(arr[i]);
        }
        return answer;
    }
}
