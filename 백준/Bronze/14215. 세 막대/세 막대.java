import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            sum += num[i];
        }

        // 배열 정렬 (오름차순)
        Arrays.sort(num);

        // 삼각형 조건에 맞도록 조정
        if (num[2] >= num[0] + num[1]) {
            num[2] = num[0] + num[1] - 1; // 가장 긴 변을 조정
        }

        // 수정된 배열의 합 계산
        int sums = Arrays.stream(num).sum();

        // 결과 출력
        bw.write(String.valueOf(sums));
        bw.flush();
        bw.close();
    }
}