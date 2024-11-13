import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] A = new int[9][9];
        int max = Integer.MIN_VALUE; // max 값을 충분히 작은 값으로 초기화
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++){
                A[i][j]=Integer.parseInt(stringTokenizer.nextToken());
                if (max < A[i][j]){
                    max = A[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(a+" "+b);
        bw.flush();
    }
}
