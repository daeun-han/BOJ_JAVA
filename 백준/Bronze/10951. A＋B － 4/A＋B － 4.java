import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write((A + B) + "\n"); // 출력 형식 수정
            bufferedWriter.flush();
        }
    }
}