import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기
        int X = Integer.parseInt(br.readLine());

        int diagonal = 1; // 몇 번째 대각선인지 저장
        int sum = 0;      // 현재 대각선의 끝 위치까지의 합

        // X가 속한 대각선을 찾음
        while (sum < X) {
            sum += diagonal;
            diagonal++;
        }

        // 대각선 번호를 하나 줄여서 X가 속한 정확한 대각선을 찾음
        diagonal--;

        // X가 대각선에서 몇 번째인지 계산
        int positionInDiagonal = X - (sum - diagonal);

        // 분수 계산
        int numerator;   // 분자의 값
        int denominator; // 분모의 값

        if (diagonal % 2 == 0) {
            // 짝수 대각선: 분자가 작아지고 분모가 커짐
            numerator = positionInDiagonal;
            denominator = diagonal - positionInDiagonal + 1;
        } else {
            // 홀수 대각선: 분자가 커지고 분모가 작아짐
            numerator = diagonal - positionInDiagonal + 1;
            denominator = positionInDiagonal;
        }

        // 결과 출력
        System.out.println(numerator + "/" + denominator);
    }
}
