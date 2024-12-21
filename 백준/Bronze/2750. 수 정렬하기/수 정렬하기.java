import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(m);

        for (int i = 0; i < n; i++) {
            bw.write(m[i]+"\n");
        }
        
        bw.flush();
    }
}