package level0;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4};
        int[] arr1 = {1,1,2,2};
        int[] arr2 = {1};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
    public static int solution(int[] arr){
        int[] list = new int[1001];
        for (int i = 0; i <arr.length; i++) {
            list[arr[i]]++;
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < list.length; i++) {
            if(max<list[i]){
                max=list[i];
                num = i;
            }else if(max>0&&max==list[i]){
                num = -1;
            }
        }
        return num;
    }
}
