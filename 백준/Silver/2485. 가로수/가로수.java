import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        // 가로수 위치 입력
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        // 가로수 위치 정렬
        Arrays.sort(num);

        // 이웃한 가로수 간 거리 계산
        int gcd = num[1] - num[0];
        for (int i = 2; i < n; i++) { // 반복문을 통해 모든 거리의 최대공약수를 누적 계산
            gcd = getGCD(gcd, num[i] - num[i - 1]);
        } // 왜 이렇게 계산? 각 거리의 GCD를 구하면, 가로수를 가장 고르게 추가할 기준을 얻을 수 있음
        // 모든 거리의 공통 분모를 찾고, 이 공통 분모(GCD)를 기준으로 가로수를 추가하기 때문에 효율적

        // 필요한 가로수 개수 계산
        int additionalTrees = (num[n - 1] - num[0]) / gcd - (n - 1);

        bw.write(String.valueOf(additionalTrees));
        bw.flush();
        br.close();
        bw.close();
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
