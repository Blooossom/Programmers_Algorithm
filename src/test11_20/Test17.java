package test11_20;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test17 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       int[] arr = new int[T];
       int[] answer = {};
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if (i == j) {
                    continue;
                }else{
                    list.add(arr[i]+arr[j]);
                }
            }
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        Collections.sort(list2);
        System.out.println(list2);
        }
    }


