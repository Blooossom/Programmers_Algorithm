import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] commands = {
        {2,5,3},
        {4,5,1},
        {1,7,3}
        };

        int[] answer = new int[commands.length];
        for (int i = 0; i <commands.length; i++) {

            int[] tmp = new int[commands[i][1]-commands[i][0]+1];
            for (int j = 0; j <tmp.length; j++) {
                tmp[j]=arr[j+commands[i][0]-1];
            }
            Arrays.sort(tmp);
            answer[i]=tmp[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
//K번째 수