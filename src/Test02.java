import java.io.*;
public class Test02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = new char[str.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        int[] arr = new int[26];
        int count = 0;
        int t = 'Z' - 65;
        System.out.println(t);
        for (int i = 0; i < ch.length; i++) {
            int p = ch[i] - 65;
            if (p < 13) {
                count += p;
            } else if(p == 13) {
                count += 13;
            } else {
                count += 'Z' - 65 - p + 1;
            }
            if (i == ch.length - 1) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
