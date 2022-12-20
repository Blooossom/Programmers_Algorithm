package level2;
import java.io.*;
import java.util.StringTokenizer;

public class Test02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        int answer = lcm(arr[0], arr[1]);
        for (int i = 0; i < arr.length; i++) {
            if(answer != lcm(answer, arr[i])) {
                answer = lcm(answer, arr[i]);
            }
        }
        return answer;
    }
    static int gcd(int p, int q){
        if (q == 0) {
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

}
