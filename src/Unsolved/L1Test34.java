package Unsolved;

import java.io.*;

public class L1Test34 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String x = br.readLine();
            if (x.equals("-1")){
                break;
            }
            String y = br.readLine();
            System.out.println(solution(x,y));
        }
    }
    public static String solution(String X, String Y){
        String answer = "";
        int[] xarr = new int[10];
        int[] yarr = new int[10];
        for (int i = 0; i <X.length(); i++) {
            xarr[Character.getNumericValue(X.charAt(i))]++;
        }
        for (int i = 0; i <Y.length(); i++) {
            yarr[Character.getNumericValue(Y.charAt(i))]++;
        }
        for (int i = yarr.length-1; i >=0; i--) {
            if(xarr[i]!=0&&yarr[i]!=0){
                for (int j = 0; j <Math.min(xarr[i],yarr[i]); j++) {
                    answer = answer + i;
                }
            }
        }
        if(answer.equals("")){
            answer = "-1";
        }
        if(answer.charAt(0)=='0'&&answer.charAt(answer.length()-1)=='0'){
            answer = "0";
        }
        return answer;
    }
}
