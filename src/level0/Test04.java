package level0;

public class Test04 {
    public static void main(String[] args) {

    }
    public static int solution(int[] arr){
        int answer = 0;
        int[] list = new int[1001];
        for (int i = 0; i <arr.length; i++) {
            list[arr[i]]++;
        }
        int max = 0;
        for (int i = 0; i <list.length; i++) {
            if(max<list[i]){
                max=list[i];
                answer = i;
            }else if(max!=0&&max==list[i]&&answer!=i){
                return answer=-1;
            }
        }
        return answer;
    }
}
