import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>(); // 큐 사용

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":  // push X
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":  // pop
                    bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.poll()));
                    bw.newLine();
                    break;
                case "size":  // size
                    bw.write(String.valueOf(queue.size()));
                    bw.newLine();
                    break;
                case "empty":  // empty
                    bw.write(queue.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;
                case "front":  // front
                    bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peek()));
                    bw.newLine();
                    break;
                case "back":  // back
                    bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peekLast()));
                    bw.newLine();
                    break;
            }
        }

        // Flush the BufferedWriter after all operations are done
        bw.flush();
        br.close();
        bw.close();
    }
}
