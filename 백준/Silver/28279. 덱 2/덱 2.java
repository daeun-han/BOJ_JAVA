import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>(); // 덱 사용

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) { // N이 0보다 클 때까지 반복하며, 반복할 때마다 N을 1 감소
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1: // 덱의 앞에 추가
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2: // 덱의 뒤에 추가
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3: // 정수가 있다면 맨 앞의 정수를 빼고 출력(poll)
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4: // 정수가 있다면 맨 뒤의 정수를 빼고 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5: // 들어있는 정수의 개수를 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case 6: // 비어있는지 확인
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7: // 정수가 있다면 맨 앞의 정수를 출력(peek)
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case 8: // 정수가 있다면 맨 뒤의 정수를 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
