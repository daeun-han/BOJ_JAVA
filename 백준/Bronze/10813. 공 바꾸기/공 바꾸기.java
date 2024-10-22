import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 선언 순서 주의
        
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] num = new int[N]; // 배열 선언

        // 공의 초기 위치 설정: num[i] = i + 1
        for (int i = 0; i < N; i++) {
            num[i] = i + 1; // 공의 번호는 1부터 시작
        }

        for (int c=0; c < M; c++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //  for 루프 내에서 i, j, k를 읽어들일 때마다 새로운 줄에 대해 StringTokenizer를 다시 초기화해야함
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;

            int k = num[i];
            num[i] = num[j];
            num[j] = k;
        }

        // 결과 출력
        for (int value : num) { // 배열에 대한 향상된 for문 사용
            bufferedWriter.write(value + " ");
        }
        bufferedWriter.flush();
    }
}