import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = bufferedReader.readLine();
        int n = (int) S.charAt(0);
        bufferedWriter.write(String.valueOf(n));

        // 결과 출력
        bufferedWriter.flush();
    }
}
