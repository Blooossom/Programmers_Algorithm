package test31_40;

import java.io.*;
public class Test33 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            long input = Long.parseLong(br.readLine());
            if(input==-1){
                break;
            }
            System.out.println(solution(input));
        }

    }
    public static long solution(long p){
        long answer = 0;
        while(true){
            if(p==1){
                break;
            }
            if (p % 2 == 0) {
                p=p/2;
            }else{
                p=(p*3)+1;
            }
            answer++;
            if(answer==500){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}
