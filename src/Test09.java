import java.util.ArrayList;
import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
    int[] arr = {12};
    Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (arr.length==1){
            list.add(-1);

        }else{
            for (int i = 0; i <arr.length; i++) {
                list.add(arr[i]);
            }
        }

            list.remove(0);
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(list.size() - 1 - i);
            }
            System.out.println(Arrays.toString(answer));




    }
}
//제일 작은 수 제거하기