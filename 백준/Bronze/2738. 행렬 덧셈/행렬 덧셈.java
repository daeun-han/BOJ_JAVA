import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                A[i][j]=Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                B[i][j]=Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                A[i][j] += B[i][j];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                bw.write(A[i][j]+" ");
            bw.write("\n");
        }
        bw.flush();
    }
}
