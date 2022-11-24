package level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("END")){
                break;
            }
            System.out.println(solution(str));
        }
    }
    public static String solution(String str){
        String answer = "";
        StringBuilder sb = new StringBuilder(str);
        answer = sb.reverse().toString();
        return answer;
    }
}
