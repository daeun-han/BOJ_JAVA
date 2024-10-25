import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // HashSet은 중복된 값을 저장하지 않는다. 그리고 저장 순서가 유지되지 않는다.
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i<10; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            h.add(n % 42);
            // 입력 받은 값의 나머지를 add 메소드를 통해 HashSet에 저장
        }
        bufferedWriter.write(String.valueOf(h.size()));
        // 결과 출력
        bufferedWriter.flush();
    }
}
