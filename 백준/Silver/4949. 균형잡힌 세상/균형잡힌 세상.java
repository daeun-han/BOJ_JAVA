import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String ps = br.readLine();
            if (ps.equals(".")) break; // 종료 조건

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char c : ps.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isValid = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty())
                bw.write("yes\n");
            else
                bw.write("no\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
