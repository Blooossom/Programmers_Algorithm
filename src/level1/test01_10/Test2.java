package level1.test01_10;

import java.util.Arrays;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String str = Long.toString(N);
        int[] answer = new int[str.length()];

        for (int i = 1; i <=str.length(); i++) {
            answer[str.length()-i] = Integer.parseInt(str.substring(i-1,i));
        }
        System.out.println(Arrays.toString(answer));
    }

}
