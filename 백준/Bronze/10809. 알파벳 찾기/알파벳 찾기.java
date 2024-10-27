import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = bufferedReader.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            // indexOf의 기능 -> 문자열에서 해당 문자의 위치를 찾고, 없으면 -1을 반환!
            bufferedWriter.write(S.indexOf(c)+" ");
        }
        bufferedWriter.flush();
    }
}
