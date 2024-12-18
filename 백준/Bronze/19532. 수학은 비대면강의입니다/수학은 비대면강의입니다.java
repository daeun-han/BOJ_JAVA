import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());
        int e = Integer.parseInt(stringTokenizer.nextToken());
        int f = Integer.parseInt(stringTokenizer.nextToken());

        // 분모를 미리 계산
        int denominator = a * e - b * d;

        if (denominator == 0) {
            // 분모가 0인 경우: 해가 없거나 무한히 많은 경우
            bw.write("No solution");
        } else {
            // x, y를 계산
            int xNumerator = c * e - b * f;
            int yNumerator = a * f - c * d;

            if (xNumerator % denominator == 0 && yNumerator % denominator == 0) {
                int x = xNumerator / denominator;
                int y = yNumerator / denominator;
                bw.write(x + " " + y);
            } else {
                // 정수 해가 아닌 경우 처리
                bw.write("No integer solution");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
