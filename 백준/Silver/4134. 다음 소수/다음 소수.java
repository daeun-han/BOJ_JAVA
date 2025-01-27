import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(br.readLine());
            while (!isPrime(a)) { // 소수가 아닐 경우
                a++; // a 값을 1 증가
            }
            bw.write(a + "\n"); // 소수가 된 a 값을 출력
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 소수 여부를 판별하는 함수
    public static boolean isPrime(long number) {
        if (number <= 1) return false; // 1 이하의 숫자는 소수가 아님
        for (int i = 2; i <= Math.sqrt(number); i++) { // 2부터 √number까지 확인
            if (number % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 소수
    }
}
