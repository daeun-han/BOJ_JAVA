import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int j = 1;  // 다음으로 나와야 하는 번호

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            // 순서대로 나올 수 있는 경우
            if (a == j) {
                j++;
            } else {
                stack.push(a);
            }

            // 스택에서 순서대로 나올 수 있는 경우 처리
            while (!stack.isEmpty() && stack.peek() == j) {
                stack.pop();
                j++;
            }
        }

        // 모든 사람이 순서대로 나왔다면 Nice, 아니면 Sad
        if (stack.isEmpty()) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
