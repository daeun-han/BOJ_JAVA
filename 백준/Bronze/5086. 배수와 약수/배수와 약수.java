import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break; // 종료 조건

            String result = calculation(a, b);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static String calculation(int a, int b) {
        if (a % b == 0)
            return "multiple";
        else if (b % a == 0)
            return "factor";
        else
            return "neither";
    }
}
