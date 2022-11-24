package level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
    }
    public static String solution(String input, int n){
        String answer = "";
        String[] arr= input.split("");
        for (int i = 0; i <arr.length; i++) {
            answer = answer + arr[i].repeat(n);
        }
        return answer;
    }
}
