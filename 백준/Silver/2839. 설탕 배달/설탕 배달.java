import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while (n >= 0) {
            // 5로 나누어떨어지면 그만
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            }
            // 5로 나누어떨어지지 않으면 3kg 봉지를 하나 더 사용
            n -= 3;
            count++;
        }

        // 정확히 나눌 수 없으면 -1 출력
        System.out.println(-1);
    }
}
