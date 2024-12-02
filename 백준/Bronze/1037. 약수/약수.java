
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            int x = Integer.parseInt(stringTokenizer.nextToken());

            if (min>x)
                min = x;
            if (max<x)
                max = x;
        }

        bw.write(String.valueOf(min*max));

        bw.flush();
        bw.close();
        br.close();
    }
}
