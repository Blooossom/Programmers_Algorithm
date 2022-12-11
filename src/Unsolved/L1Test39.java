package Unsolved;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//짝꿍숫자
public class L1Test39 {
    public static void main(String[] args) {
        String x = "12321";
        String y = "42531";
        System.out.println(solution(x,y));
    }
    public static String solution(String x, String y){
        String answer = "";
        String[] xarr = x.split("");
        String[] yarr = y.split("");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < xarr.length; i++) {
            map.put(Integer.parseInt(xarr[i]), 0);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < yarr.length; i++) {
            list.add(Integer.parseInt(yarr[i]));
        }
        System.out.println(Collections.frequency(list, 1));
        System.out.println(map.keySet());
        for (int i = 0; i < map.keySet().size(); i++) {
            if (map.keySet().contains(list.get(i))) {
                map.put(list.get(i), Collections.frequency(list,map.get(i)));
            }
        }
        System.out.println(map);
        for (int i = 0; i < map.size(); i++) {
            answer = answer + map.get(i);
        }
        return answer;
    }
}
