import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder(); // 약수 문자열을 담기 위한 StringBuilder

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            if (sum == n) {
                sb.setLength(sb.length() - 3);
                bw.write(n + " = " + sb.toString() + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
