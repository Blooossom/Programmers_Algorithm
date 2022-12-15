package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            deque.offer(arr[i]);
        }
        int count = 0;
        while(!deque.isEmpty()){
            if (deque.size() == 1) {
                count++;
                deque.poll();
                break;
            }
            if (deque.peekFirst() + deque.peekLast() > limit) {
                deque.pollLast();
                count++;
            } else if(deque.peekFirst() + deque.peekLast() <= limit) {
                deque.pollFirst();
                deque.pollLast();
                count++;
            }
        }
        System.out.println(count);

    }
}
