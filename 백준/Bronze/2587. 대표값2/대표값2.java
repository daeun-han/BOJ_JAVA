import java.io.*;
import java.util.Arrays;

public class Main {   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] m = new int[5];
        for (int i = 0; i < 5; i++) {
            m[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(m);

        bw.write((Arrays.stream(m).sum())/5+"\n"+m[2]);

        bw.flush();
    }
}