package level0;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {
    public static void main(String[] args) {
        String b = "olleh";
        String a = "hello";
        System.out.println(solution(b,a));
    }
    public static int solution(String before, String after){
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i <before.length(); i++) {
            list1.add(before.substring(i,i+1));
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <after.length(); i++) {
            list2.add(after.substring(i,i+1));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int answer = 0;
        if (list1.equals(list2)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
