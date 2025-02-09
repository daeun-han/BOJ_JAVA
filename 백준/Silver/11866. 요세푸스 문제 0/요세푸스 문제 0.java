import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // LinkedList를 이용한 Queue(FIFO) 구조를 활용하여 -> 원형 큐처럼 동작
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> result = new ArrayList<>();

        // 1부터 N까지 큐에 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 요세푸스 순열 구하기
        while (!queue.isEmpty()) {
            // (K-1)번 앞으로 보냄
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            // K번째 요소 제거 및 저장
            result.add(queue.poll());
        }

        // 결과를 StringBuilder로 만들어 한 번에 출력(I/O 연산을 최소화하기 위한 StringBuilder 사용)
        StringBuilder sb = new StringBuilder();

        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                sb.append(result.get(i));
            } else {
                sb.append(result.get(i)).append(", ");
            }
        }
        sb.append(">");

        // 출력 후 flush & close
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
