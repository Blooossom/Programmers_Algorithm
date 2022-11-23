package level1.test01_10;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean answer = true;
        s=s.toUpperCase();
        int count = 0;

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='P'){
                count++;
            }else if(s.charAt(i)=='Y'){
                count--;
            }
            if (count==0){
                answer = true;
            }else{answer = false;}
        }
        System.out.println(answer);
    }
}
