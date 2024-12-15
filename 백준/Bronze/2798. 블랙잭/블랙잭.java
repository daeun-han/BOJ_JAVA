import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] num = new int[n];

        stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int maxSum = 0;

        // 세 장의 카드를 고르는 모든 조합 확인
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = num[i] + num[j] + num[k];

                    if (sum <= m && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(maxSum);

    }
}