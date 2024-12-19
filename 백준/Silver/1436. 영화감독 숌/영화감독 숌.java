import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0; // '666'이 포함된 숫자를 센 횟수
        int num = 666; // 첫 번째 숫자 시작점

        while (true) {
            // 숫자에 '666'이 포함되어 있는지 확인
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            // n번째 숫자를 찾았을 경우 출력 후 종료
            if (count == n) {
                bw.write(String.valueOf(num));
                bw.flush();
                break;
            }
            num++; // 숫자 증가
        }
    }
}