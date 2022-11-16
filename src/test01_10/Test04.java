package test01_10;

import java.util.Arrays;
import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long answer = sc.nextLong();
        String str = Long.toString(answer);
        int[] arr = new int[str.length()];

        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        String result= "";
        for (int i = 0; i <arr.length; i++) {
            result += arr[i];
        }
        answer = Long.parseLong(result);
        System.out.println(answer);
    }
}
