package level0;
import java.io.*;
public class Test03 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(solution(A,B));
    }
    public static int solution(int num1, int num2){
        int answer=0;
        answer=num1+num2;
        return answer;
    }
}
