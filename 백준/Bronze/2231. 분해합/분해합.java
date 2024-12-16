import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0; // 생성자 초기값 (없으면 0 출력)

        // N의 최대 생성자는 N - (9 * 자리수), 최소는 1
        for (int i = Math.max(1, n - 9 * String.valueOf(n).length()); i < n; i++) {
            int sum = i; // 현재 수
            int temp = i;

            // 각 자리수 합 계산
            while (temp > 0) {
                sum += temp % 10; // 마지막 자리수 더하기
                temp /= 10; // 다음 자리수로 이동
            }

            // 분해합이 N이면 결과 업데이트 후 종료
            if (sum == n) {
                result = i;
                break;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}