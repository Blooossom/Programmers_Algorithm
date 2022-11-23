package level1.test11_20;

public class Test20 {
    public static void main(String[] args) {
        int[] arr = {4,7,12};
        boolean[] list = {true,false,true};
        System.out.println(solution(arr,list));
    }
    public static int solution(int[] absolutes, boolean[] signs){
        int answer =0;
        for (int i = 0; i <absolutes.length; i++) {
            if(signs[i]){
                answer+=absolutes[i];
            }else{
                answer+=absolutes[i]*-1;
            }
        }
        return answer;
    }
}
