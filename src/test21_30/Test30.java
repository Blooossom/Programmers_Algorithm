package test21_30;

import java.util.ArrayList;
import java.util.Collections;

public class Test30 {
    public static void main(String[] args) {
        String input = "Zbcdefg";
        System.out.println(solution(input));
    }
    public static String solution(String s){
        String answer ="";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <s.length(); i++) {
            list.add(s.substring(i,i+1));
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i <list.size(); i++) {
            answer = answer + list.get(i);
        }
        return answer;
    }
}
