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

        for (int c=0; c < M; c++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //  for 루프 내에서 i, j, k를 읽어들일 때마다 새로운 줄에 대해 StringTokenizer를 다시 초기화해야함
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1; // 0 기반 인덱스로 변환
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1; // 0 기반 인덱스로 변환
            int k = Integer.parseInt(stringTokenizer.nextToken());

            for (int count = i; count <= j; count++)
                num[count] = k;
        }

        // 결과 출력
        for (int value : num) { // 배열에 대한 향상된 for문 사용
            bufferedWriter.write(value + " ");
        }
        bufferedWriter.flush();
    }
}