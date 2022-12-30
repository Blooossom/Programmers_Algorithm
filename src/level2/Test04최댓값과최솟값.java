package level2;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test04최댓값과최솟값 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
    static String Solution(String s){
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        int count = st.countTokens();

        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}
