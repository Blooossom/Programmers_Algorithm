package level1.test21_30;

import java.util.ArrayList;
import java.util.Collections;

public class Test23 {
    public static void main(String[] args) {
        int[] arr = {3,2,6};
        int div = 10;
        System.out.println(solution(arr,div));
    }
    public static ArrayList<Integer> solution(int[] arr, int divisor){
        ArrayList<Integer> answer =new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%divisor==0) answer.add(arr[i]);
        }
        if(answer.size()==0){
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
}
