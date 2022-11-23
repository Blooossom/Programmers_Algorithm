package level1.test01_10;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
        for (int i = 0; i <arr.length; i++) {
            arr[i].toUpperCase();
            String[] tmp = arr[i].split("");
            arr[i] = "";
            for (int j = 0; j <tmp.length; j++) {
                if(j%2!=0){
                   tmp[j]=tmp[j].toLowerCase();
                }else if(j%2==0){
                    tmp[j]=tmp[j].toUpperCase();
                }
                arr[i] += tmp[j];
            }
        }
        String answer = "";
        for (int k = 0; k <arr.length; k++) {
            answer += arr[k]+"\s";
        }
        System.out.println(answer.trim());
    }
}
// 공백이 하나 이상일 떄,
// 문자열의 시작과 끝이 공백인 경우도 있음.