import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // 스택 사용

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:  // push X
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:  // pop(맨 위(top)의 값을 제거하면서 그 값을 반환)
                    System.out.println(stack.isEmpty() ? "-1" : stack.pop());
                    // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력
                    break;
                case 3:  // size
                    System.out.println(stack.size());
                    // 스택에 들어있는 정수의 개수를 출력
                    break;
                case 4:  // empty
                    System.out.println(stack.isEmpty() ? "1" : "0");
                    // 스택이 비어있으면 1, 아니면 0을 출력
                    break;
                case 5:  // top(스택의 맨 위 값만 확인하고 제거하지는 않는다)
                    System.out.println(stack.isEmpty() ? "-1" : stack.peek());
                    // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력
                    break;
            }
        }
    }
}
