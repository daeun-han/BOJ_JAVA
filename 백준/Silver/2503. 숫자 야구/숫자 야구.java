import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 힌트의 개수 입력

        int[][] hint = new int[n][3]; // 힌트 정보를 저장할 배열
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            hint[i][0] = Integer.parseInt(st.nextToken()); // 추측한 숫자
            hint[i][1] = Integer.parseInt(st.nextToken()); // 스트라이크 개수
            hint[i][2] = Integer.parseInt(st.nextToken()); // 볼 개수
        }

        int answer = 0; // 가능한 정답 개수를 저장할 변수

        // 가능한 모든 세 자리 숫자(100~999) 중에서 검사
        for (int a = 1; a <= 9; a++) { // 100의 자리
            for (int b = 1; b <= 9; b++) { // 10의 자리
                for (int c = 1; c <= 9; c++) { // 1의 자리
                    if (a == b || b == c || c == a) continue; // 숫자가 중복되면 제외

                    boolean possible = true; // 해당 숫자가 정답이 될 가능성이 있는지 체크

                    for (int[] arr : hint) { // 주어진 힌트들과 비교
                        int number = arr[0]; // 힌트 숫자
                        int expectedStrike = arr[1]; // 힌트의 스트라이크 개수
                        int expectedBall = arr[2]; // 힌트의 볼 개수

                        // 힌트 숫자를 각 자리로 분리
                        int x = number / 100; // 100의 자리
                        int y = (number / 10) % 10; // 10의 자리
                        int z = number % 10; // 1의 자리

                        int strikeCount = 0;
                        int ballCount = 0;

                        // 스트라이크 체크 (자리와 숫자가 일치하면 증가)
                        if (a == x) strikeCount++;
                        if (b == y) strikeCount++;
                        if (c == z) strikeCount++;

                        // 볼 체크 (숫자는 존재하지만 자리가 다르면 증가)
                        if (a == y || a == z) ballCount++;
                        if (b == x || b == z) ballCount++;
                        if (c == x || c == y) ballCount++;

                        // 힌트 조건과 일치하지 않으면 불가능한 숫자로 판단
                        if (strikeCount != expectedStrike || ballCount != expectedBall) {
                            possible = false;
                            break; // 불가능한 경우 더 이상 체크할 필요 없음
                        }
                    }

                    if (possible) answer++; // 모든 힌트를 만족하는 경우 정답 개수 증가
                }
            }
        }

        System.out.println(answer); // 가능한 정답 개수 출력
    }
}
