import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1)
            bw.write("");
        else {
            for (int j = 2; j <= n; j++) {
            while (n % j == 0){
                    bw.write(j + "\n");
                    n = n / j;
                    }
                }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}