import java.io.*;
import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long[] answer = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += x;
            answer[i] = sum;
        }
        System.out.println(Arrays.toString(answer));
    }
}
