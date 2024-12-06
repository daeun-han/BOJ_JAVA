import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            triangle(a, b, c, bw);
            bw.newLine(); // 결과 줄바꿈
        }
        bw.flush();
        bw.close();
    }

    private static void triangle(int a, int b, int c, BufferedWriter bw) throws IOException {
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                bw.write("Equilateral");
            } else if (a == b || b == c || a == c) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Invalid");
        }
    }
}
