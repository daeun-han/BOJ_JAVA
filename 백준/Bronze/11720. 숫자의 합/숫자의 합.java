import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(bufferedReader.readLine());

        int sum = 0;

        // 문자열을 한문자씩 분리하여 숫자로 더한다.
        String[] num = bufferedReader.readLine().split("");
        for (int i = 0; i < m; i++) {
            sum += Integer.parseInt(num[i]);
        }
        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
    }
}