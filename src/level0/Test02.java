package level0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(solution(A,B));
    }
    public static int solution(int a, int b){
        int answer = 0;
        answer=a*b;
        return answer;
    }
}
