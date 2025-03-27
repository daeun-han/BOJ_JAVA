import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            long t = Long.parseLong(br.readLine());

            for (int j = 2; j < 1000001; j++) {
                if (t % j == 0) {
                    bw.write("NO\n");
                    break;
                }
                if (j == 1000000)
                    bw.write("YES\n");
            }
            bw.flush();
        }
    }
}