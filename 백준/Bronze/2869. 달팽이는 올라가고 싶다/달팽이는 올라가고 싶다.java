import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // 시간초과를 막기 위해, 단순 반복에서 최적화 -> 코드가 빠른 이유: 반복문을 제거하고 단순 수학 계산으로 필요한 일 수를 바로 구하기 때문에 시간 복잡도가 **O(1)**
        int day = (v - b - 1) / (a - b) + 1; // (v - b)는 마지막 날 밤에 미끄러지지 않는 높이
        // 나머지가 발생할 경우 올림 처리하기 위해 -1을 더하고 정수 나눗셈을 사용

        System.out.println(day);
    }
}
