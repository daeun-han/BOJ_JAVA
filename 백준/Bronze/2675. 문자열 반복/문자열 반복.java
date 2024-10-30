import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열을 한 문자씩 분리
        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int R = Integer.parseInt(stringTokenizer.nextToken());  // 반복 횟수 입력
            String S = stringTokenizer.nextToken();  // 문자열 입력

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {
                // 각 문자를 R번 반복하여 result에 추가
                for (int k = 0; k < R; k++) {
                    result.append(S.charAt(j));
                }
            }
            // 결과를 BufferedWriter로 출력
            bufferedWriter.write(result.toString()+"\n"); //StringBuilder 사용시 result.toString()
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
