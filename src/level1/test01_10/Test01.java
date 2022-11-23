package level1.test01_10;

import java.util.Scanner;
public class Test01{ //자릿수더하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = Integer.toString(N);
        int result = 0;

        for (int i = 0; i <str.length(); i++) {
            result += Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(result);
    }
}
