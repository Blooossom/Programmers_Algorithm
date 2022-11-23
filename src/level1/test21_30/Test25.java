package level1.test21_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[2];
        arr[0]=gcd(n,m);
        arr[1]=lcm(n,m);
        System.out.println(Arrays.toString(arr));
    }
    public static int gcd(int p, int q){
        if (q == 0) {
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
