package level1.test31_40;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test37 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {10,100,20,150,1,100,200};
        int k = 3;
        System.out.println(Arrays.toString(solution(k,arr)));

    }
    public static int[] solution(int k, int[] score){
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        for (int i = 0; i <score.length; i++) {
            if(i+1<=k){
                list.add(score[i]);
            }else{
                if(score[i]> Collections.min(list)){
                    list.remove(list.indexOf(Collections.min(list)));
                    list.add(score[i]);
                }
            }
            answer[i]=Collections.min(list);
        }
        return answer;
    }
}
