
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int Xmin = Integer.MAX_VALUE;
        int Xmax = Integer.MIN_VALUE;
        int Ymin = Integer.MAX_VALUE;
        int Ymax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            if (Xmin>x)
                Xmin = x;
            if (Xmax<x)
                Xmax = x;

            if (Ymin>y)
                Ymin = y;
            if (Ymax<y)
                Ymax = y;
        }

        bw.write(String.valueOf((Xmax-Xmin)*(Ymax-Ymin)));

        bw.flush();
        bw.close();
        br.close();
    }
}