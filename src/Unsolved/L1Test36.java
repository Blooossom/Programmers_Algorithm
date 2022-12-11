package Unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//시간초과
public class L1Test36 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());
        int pow = Integer.parseInt(st.nextToken());
        System.out.println(solution(num,lim,pow));
    }
    public static int solution(int number, int limit, int power){
        int answer = 0;
        for (int i = 1; i <=number; i++) {
            int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count>limit){
                count=power;
            }
            System.out.println(count);
            answer+=count;
        }

        return answer;
    }
}
