import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = (int) Math.sqrt(n); // n 이하의 제곱수 개수

        bw.write(result + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
