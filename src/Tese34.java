import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class Tese34 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String x = br.readLine();
            if (x.equals("-1")){
                break;
            }
            String y = br.readLine();
            System.out.println(solution(x,y));
        }
    }
    public static String solution(String X, String Y){
        String answer = "";
        String[] x = X.split("");
        String[] y = Y.split("");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j <y.length; j++) {
                if(x[i].equals(y[j])){
                    list.add(Integer.parseInt(x[i]));
                    break;
                }
            }
        }
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i <list.size(); i++) {
            answer = answer + list.get(i);
        }
        return answer;
    }
}
