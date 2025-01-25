import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());

        int e = a*d+b*c;
        int f = b*d;

        // 기약분수로 변환
        int gcd = getGCD(e, f); // 최대공약수
        e /= gcd; // 분자를 GCD로 나눔
        f /= gcd; // 분모를 GCD로 나눔

        bw.write(String.valueOf(e));
        bw.write(" ");
        bw.write(String.valueOf(f));

        bw.flush();
        br.close();
        bw.close();
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private static int getGCD(int e, int f) {
        while (f != 0) {
            int temp = f;
            f = e % f;
            e = temp;
        }
        return e;
    }

}
