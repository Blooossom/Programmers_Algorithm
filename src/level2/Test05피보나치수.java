package level2;
import java.io.*;
import java.util.Arrays;

public class Test05피보나치수 {
    static int div = 1234567;
    static int[] dp;
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int p = Integer.parseInt(br.readLine());
        System.out.println(Solution(p));
    }
    static int Solution(int n){
        dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i -1] + dp[i - 2];
            dp[i] %= div;
        }
        return dp[n];
    }
}
