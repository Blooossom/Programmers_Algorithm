package test11_20;

import java.io.*;
public class Test14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = left; i <=right ; i++) {
            int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
           answer = count%2==0? answer+i:answer-i;
        }
        System.out.println(answer);
    }
}
