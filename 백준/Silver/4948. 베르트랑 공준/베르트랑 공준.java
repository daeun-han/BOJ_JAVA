import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break; // 0이 입력되면 즉시 종료

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) { // 범위를 n < x <= 2n으로 수정
                if (isPrime(i)) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 소수 여부를 판별하는 함수
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
