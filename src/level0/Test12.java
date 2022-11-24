package level0;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        String[] str = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(str)));
    }
    static int[] solution(String[] strlist){
        int[] answer =new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}
