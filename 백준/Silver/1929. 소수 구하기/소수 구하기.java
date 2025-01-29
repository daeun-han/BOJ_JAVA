import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = m; i <= n; i++) { // i <= n으로 범위 수정
            if (isPrime(i)) { // 소수일 경우에만 출력
                bw.write(i + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 소수 여부를 판별하는 함수
    public static boolean isPrime(int number) { // long이 아니라 int로 변경 (입력 범위가 int이므로)
        if (number < 2) return false; // 1 이하는 소수가 아님
        for (int i = 2; i <= Math.sqrt(number); i++) { // 2부터 √number까지 확인
            if (number % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 소수
    }
}
