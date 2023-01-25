package level2;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test03_기능개발 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] pr = {95, 90, 99, 99, 80, 99};
        int[] sp = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(solution(pr, sp)));
    }
    static int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();
        int day = 1;
        int k = 0;
        int count = 0;
            label2:
            while(true){
                if(progresses[k] + (speeds[k] * day) >= 100){
                    count++;
                    k++;
                    while (true) {
                        if(k >= progresses.length){
                            break;
                        }
                        if(progresses[k] + (speeds[k] * day) >= 100){
                            k++;
                            count++;
                        } else {
                            break;
                        }
                    }
                    list.add(count);
                    count = 0;
                    if (k >= progresses.length) {
                        break label2;
                    }
                } else {
                    day++;
                }
            }
        int[] answer;
        return  answer = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
