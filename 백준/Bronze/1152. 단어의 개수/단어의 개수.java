import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = bufferedReader.readLine();  // 문자열 입력

        // StringTokenizer를 사용하여 단어 수 계산
        StringTokenizer st = new StringTokenizer(S);
        int wordCount = st.countTokens();  // 단어 수를 셈

        bufferedWriter.write(String.valueOf(wordCount));  // 결과 출력
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
