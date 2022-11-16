package test21_30;

import java.io.*;
public class Test28 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(a,b,n));
    }
    public static int solution(int a, int b, int n){
        int temp = 0;
        while(true){
            temp += n/a*b;
            n = n-n/a*a+n/a*b;
            if (n<a) {
                break;
            }
        }
        return temp;
    }
}
