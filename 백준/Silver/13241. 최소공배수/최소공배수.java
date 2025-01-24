import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        long a = Long.parseLong(stringTokenizer.nextToken());
        long b = Long.parseLong(stringTokenizer.nextToken());

        // 최소공배수 계산
        long gcd = getGCD(a, b); // 최대공약수
        long lcm = (a * b) / gcd; // 최소공배수

        // 결과 출력
        bw.write(lcm + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
