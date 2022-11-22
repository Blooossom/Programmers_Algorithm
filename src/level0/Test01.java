package level0;

import java.io.*;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
    public static ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();
        int input = 1;
        while(true){
            if(input>n){
                break;
            }
            answer.add(input);
            input+=2;
        }
        return answer;
    }
}
