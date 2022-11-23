package level1.test11_20;

public class Test18 {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 0, 2, -5};
        System.out.println(solution(arr));
    }
    public static int solution(int[] number){
        int answer = 0;
        for (int i = 0; i <number.length-1 ; i++) {
            for (int j = i+1; j <number.length; j++) {
                int check = number[i]+number[j];
                for (int k = j+1; k <number.length ; k++) {
                    if (check+number[k]==0){
                        answer++;
                    }
                }
            }

        }
        return answer;
    }
}
