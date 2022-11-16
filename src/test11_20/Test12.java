package test11_20;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test12 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <n; i++) {
            if(n%i==1){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
