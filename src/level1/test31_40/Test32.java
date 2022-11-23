package level1.test31_40;

import java.io.*;
public class Test32 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N==0){
                break;
            }
            System.out.println(solution(N));
        }
    }
    public static boolean solution(int x){
        String str = Integer.toString(x);
        String[] arr = str.split("");
        boolean answer = true;
        int div = 0;
        for (int i = 0; i <arr.length; i++) {
            div+= Integer.parseInt(arr[i]);
        }
        if(x%div!=0){
            answer=false;
        }
        return answer;
    }
}
