package level1.test01_10;

import java.io.*;
import java.util.StringTokenizer;

public class Test07 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N; i++) {
            answer[i]= Integer.parseInt(st.nextToken());
        }

        String str1 = "12345".repeat(N/5)+"12345".substring(0,N%5-1);
        String str2 = "21232425".repeat(N/8)+"21232425".substring(0,N%8-1);
        String str3 = "3311224455".repeat(N/10)+"3311224455".substring(0,N%10-1);

        int count1 =0;
        int count2 =0;
        int count3 =0;
        for (int i = 0; i <answer.length; i++) {
            if (str1.charAt(i)==answer[i]){
                count1++;
            }
            if (str2.charAt(i)==answer[i]){
                count2++;
            }
            if (str3.charAt(i)==answer[i]){
                count3++;
            }
        }
        if(count1==count2&&count2==count3){
            int[] score = {count1, count2, count3};
        }

        }
}
