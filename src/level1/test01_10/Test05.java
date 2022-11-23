package level1.test01_10;

import java.io.*;
import java.util.Arrays;

public class Test05 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] answer;
        if(N==1){
        answer= new int[1];
        answer[0]=-1;
        }else
        answer = new int[arr.length-1];
        for (int i = 0; i <answer.length; i++) {
            answer[i]=arr[answer.length-i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
