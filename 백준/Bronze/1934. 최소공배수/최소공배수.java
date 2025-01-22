import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            // 최소공배수 계산
            int gcd = getGCD(a, b); // 최대공약수
            int lcm = (a * b) / gcd; // 최소공배수

            // 결과 출력
            bw.write(lcm + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
