import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] num = new int[N];

        // 공의 초기 위치 설정: num[i] = i + 1
        for (int i = 0; i < N; i++) {
            num[i] = i + 1;
        }

        for (int c = 0; c < M; c++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;

            // i와 j 범위의 공을 뒤집음
            while (i < j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                i++;
                j--;
            }
        }

        // 결과 출력
        for (int value : num) {
            bufferedWriter.write(value + " ");
        }
        bufferedWriter.flush();
    }
}
