package level1.test21_30;

import java.util.ArrayList;

public class Test29 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int[] arr = {4,4,4,3,3};
        for (int i = 0; i <arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(solution(list));
    }
    public static ArrayList<Integer> solution(ArrayList<Integer> list){
        ArrayList<Integer> answer = new ArrayList<>();
        int size = list.size();
        answer.add(list.get(0));
        for (int i = 1; i <size; i++) {
            if(list.get(i)!=list.get(i-1)) {
                answer.add(list.get(i));
            }
        }
        return answer;
    }
}
