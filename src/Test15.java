import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test15 {
    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        Collections.sort(list);
        list.remove(0);
        Collections.reverse(list);
        if (list.size() == 0) {
            answer=new int[1];
            answer[0]=-1;
        }else{
            answer=new int[list.size()];
            for (int i = 0; i <list.size(); i++) {
                answer[i]=list.get(i);
            }
        }
        return answer;
    }
}
