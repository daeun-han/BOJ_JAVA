import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기
        String input = br.readLine();
        // 공백 기준으로 나누기
        String[] splitInput = input.split(" ");
        String B = splitInput[0]; // 변환할 숫자 문자열
        int N = Integer.parseInt(splitInput[1]); // 진법

        // 결과값 초기화
        int result = 0;
        int power = 0;

        // 뒤에서부터 한 자리씩 읽어오기
        for (int i = B.length() - 1; i >= 0; i--) {
            char c = B.charAt(i);

            // 문자를 숫자로 변환
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0'; // '0'~'9'
            } else {
                digit = c - 'A' + 10; // 'A'~'Z'는 10~35
            }

            // 진법 계산
            result += digit * Math.pow(N, power); // Math.pow를 사용해 거듭 제곱 계산
            power++;
        }

        // 결과 출력
        System.out.println(result);
    }
}
