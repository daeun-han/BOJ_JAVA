import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int Q, D, N, P;

        for (int i = 0; i < T; i++){
            int C = Integer.parseInt(br.readLine());
            Q = C / 25;
            C = C % 25;
            D = C / 10;
            C = C % 10;
            N = C / 5;
            C = C % 5;
            P = C;
            bw.write(Q + " "+ D + " " + N + " " + P + "\n");
        }
        bw.flush();
    }
}
