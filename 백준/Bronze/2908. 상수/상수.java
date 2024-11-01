import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 개의 세 자리 수를 입력받기
        String[] numbers = bufferedReader.readLine().split(" "); // 공백으로 분리하여 배열에 저장

        // 각각의 숫자를 뒤집기
        String reversedA = new StringBuilder(numbers[0]).reverse().toString();
        String reversedB = new StringBuilder(numbers[1]).reverse().toString();

        // 뒤집은 숫자를 정수로 변환
        int valueA = Integer.parseInt(reversedA);
        int valueB = Integer.parseInt(reversedB);

        // 두 값 중 큰 값을 출력
        bufferedWriter.write(String.valueOf(Math.max(valueA, valueB))); // 큰 값 출력

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
