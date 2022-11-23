package level1.test31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test35 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(arr)));
    }
    static int[] solution(int[] arr){
        String A = "12345".repeat(2000);
        String B = "21232425".repeat(1250);
        String C = "3311224455".repeat(1000);
        int a = 0;
        int b = 0;
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Character.getNumericValue(A.charAt(i))) {
                a++;
            }
            if (arr[i] == Character.getNumericValue(B.charAt(i))) {
                b++;
            }

            if (arr[i] == Character.getNumericValue(C.charAt(i))) {
                c++;
            }
        }
        if(a==0&&b==0&&c==0){
            int[] answer = {};
            return answer;
        }
        if(a==b&&b==c){
            int[] answer ={1,2,3};
            return answer;
        } else if (a!=b&&b!=c&&a!=c) {
            list.add(a);
            list.add(b);
            list.add(c);
            int[] answer = {list.indexOf(Collections.max(list))+1};
            return answer;
        } else if (a == b && a != c) {
            if(a>c){
                int[] answer = {1,2};
                return answer;
            }else{
                int[] answer = {3};
                return answer;

            }
        }else if (a == c && a != b) {
            if(a>b){
                int[] answer = {1,3};
                return answer;
            }else{
                int[] answer = {2};
                return answer;

            }
        }else{
            if(a<c){
                int[] answer = {2,3};
                return answer;
            }else{
                int[] answer = {1};
                return answer;

            }
        }
    }
}
