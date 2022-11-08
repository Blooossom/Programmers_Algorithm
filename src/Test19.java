public class Test19 {
    public static void main(String[] args) {
        int p =3;
        int m = 40;
        int c = 4;
        System.out.println(solution(p,m,c));
    }
    public static long solution(int price, int money, int count){
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <=count; i++) {
            sum += (long) price *i;
        }
        if(sum<=money){
            return 0;
        }else {
            answer = sum - money;
            return answer;
        }
    }
}
