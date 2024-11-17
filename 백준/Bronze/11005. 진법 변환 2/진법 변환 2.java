import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 10진법 숫자
        int B = Integer.parseInt(input[1]); // 변환할 진법

        StringBuilder result = new StringBuilder();

        // 진법 변환
        while (N > 0) {
            int remainder = N % B;

            // 나머지를 문자로 변환
            if (remainder < 10) {
                result.append(remainder); // 숫자
            } else {
                result.append((char) ('A' + (remainder - 10))); // 문자 ('A'부터 시작)
            }

            N /= B; // 몫 계산
        }

        // 결과를 뒤집어서 출력
        System.out.println(result.reverse().toString());
    }
}
