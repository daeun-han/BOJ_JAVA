import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 2;

        for(int i = 0; i < N; i++) {
            result += Math.pow(2, i);
        }
        bw.write(String.valueOf((int) Math.pow(result, 2)));
        bw.flush();
    }
}
