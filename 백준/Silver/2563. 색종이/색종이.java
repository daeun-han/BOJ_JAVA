import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 100x100 크기의 평면을 나타내는 2차원 배열을 초기화
        int[][] plane = new int[100][100];

        // 색종이의 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 각 색종이에 대해 시작 좌표를 입력받고 색종이 영역 표시
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());  // 색종이의 왼쪽 아래 모서리 x 좌표
            int y = Integer.parseInt(stringTokenizer.nextToken());  // 색종이의 왼쪽 아래 모서리 y 좌표

            // 10x10 크기의 색종이 영역을 평면에 표시
            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {
                    plane[x + dx][y + dy] = 1;  // 색종이로 덮인 칸을 1로 설정
                }
            }
        }

        // 평면에서 1로 표시된 칸을 모두 합산하여 총 넓이를 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (plane[i][j] == 1) {
                    area++;  // 색종이로 덮인 부분이면 카운트 증가
                }
            }
        }
        // 결과 출력
        System.out.println(area);
    }
}
