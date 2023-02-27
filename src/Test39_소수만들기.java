import java.util.Arrays;

public class Test39_소수만들기 {
    static boolean prime[];
    static class Solution {
        public static int solution(int[] nums) {
            int answer = 0;
            isPrime();
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        if (!prime[sum]) {
                         answer++;
                        }
                    }
                }
            }
            System.out.println("Hello Java");
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 6, 4};
        System.out.println(Solution.solution(arr));
    }
    private static void isPrime(){
        prime = new boolean[2998];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}
