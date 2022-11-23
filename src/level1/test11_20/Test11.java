package level1.test11_20;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int N = 5;
        int[] stage = {2,1,2,6,2,4,3,3};
        int[] result = new int[N];
        Arrays.sort(stage);
        int[] tmp = new int[stage[stage.length-1]];
        System.out.println(Arrays.toString(tmp));
        for (int i = 0; i < stage.length; i++) {
            tmp[stage[i]-1]++;
        }
        System.out.println(Arrays.toString(tmp));

    }
}
