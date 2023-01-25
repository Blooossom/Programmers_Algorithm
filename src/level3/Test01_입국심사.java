package level3;

import java.util.Arrays;

public class Test01_입국심사 {
    public static void main(String[] args) {

    }
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long sp, ep, sum, mid;
        sp = 1;
        ep = (long)times[times.length - 1] * n;

        while (sp <= ep) {
            sum = 0;
            mid = (sp + ep) / 2;
            for (int time:times) {
                sum += mid / time;
            }

            if (sum >= n) {
                ep = mid - 1;
                answer = mid;
            }
            else {
                sp = mid + 1;
            }
        }
        return answer;
    }
}
