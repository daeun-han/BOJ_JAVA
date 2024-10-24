import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        String S = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());

        // 결과 출력
        bufferedWriter.write(S.charAt(i - 1));
        bufferedWriter.flush();
    }
}
