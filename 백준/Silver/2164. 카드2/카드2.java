import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>(); // 큐 사용

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 맨 앞의 카드를 버림
            queue.offer(queue.poll()); // 맨 앞의 카드를 맨 뒤로 이동
        }

        bw.write(String.valueOf(queue.poll())); // 마지막 남은 카드 출력
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
