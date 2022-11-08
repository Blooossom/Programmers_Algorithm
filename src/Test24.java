import java.io.*;
public class Test24 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
    public static String solution(String s){
        String answer = "";
        if(s.length()%2!=0){
            answer=s.substring(s.length()/2,(s.length()/2)+1);
        }else{
            answer=s.substring((s.length()/2)-1,(s.length()/2)+1);
        }
        return answer;
    }
}
