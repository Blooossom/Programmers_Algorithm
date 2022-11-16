package test11_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        list.remove(Collections.min(list));
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
