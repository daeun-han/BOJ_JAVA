import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // 스택 사용

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n!=0)
                stack.push(n);
            else
                stack.pop();
        }

        int result = sumStack(stack);

        System.out.println(result);
    }
    public static int sumStack(Stack<Integer> stack) {
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop(); // pop으로 하나씩 꺼내면서 합산
        }
        return sum;
    }
}
