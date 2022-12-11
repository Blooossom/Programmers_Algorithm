import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

    }
    static String Solution(String number, int k){
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <number.length(); i++) {
            list.add(Integer.parseInt(number.substring(i,i+2)));
        }
        for (int i = 0; i <list.size()-k; i++) {
            int max = Collections.max(list);
            answer = answer + Integer.toString(max);
            for (int j = 0; j <=list.indexOf(max) ; j++) {
                list.remove(j);
            }
        }
        return answer;
    }
}
