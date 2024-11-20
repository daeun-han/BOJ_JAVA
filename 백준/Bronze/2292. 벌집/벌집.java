import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 벌집 층을 나타내는 변수
        int layer = 1;
        int range = 1; // 현재 방의 범위 (1부터 시작)

        // 범위를 초과할 때까지 반복
        while (range < N) {
            range += 6 * layer; // 각 층의 방 수는 6의 배수로 증가
            layer++;
        }

        bw.write(String.valueOf(layer));
        bw.flush();
    }
}
