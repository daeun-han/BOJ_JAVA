import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // 스택 사용

        for (int i = 0; i < t; i++) {
            String ps = br.readLine();
            stack.clear();
            boolean isValid = true; // VPS 여부를 저장할 변수

            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    stack.push(1);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isValid = false; // 올바르지 않은 VPS
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty())
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }

        bw.flush();
    }
}
