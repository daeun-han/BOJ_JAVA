import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++){
            String S = bufferedReader.readLine();
            bufferedWriter.write(S.charAt(0) + "" + S.charAt(S.length() - 1) + "\n");
        }

        // 결과 출력
        bufferedWriter.flush();
    }
}
