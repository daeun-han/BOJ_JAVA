import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 n과 m 입력
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken()); // n: 엔트리 개수
        int m = Integer.parseInt(stringTokenizer.nextToken()); // m: 쿼리 개수

        // 양방향 매핑을 위한 Map
        Map<Integer, String> logMap = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();

        // n개의 이름과 번호 매핑
        for (int i = 1; i <= n; i++) { // 번호는 1부터 시작
            String name = br.readLine();
            logMap.put(i, name);
            reverseMap.put(name, i); // 역방향 매핑
        }

        // 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // m개의 쿼리 처리
        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            // 정수인지 문자열인지 확인 후 적절히 처리
            if (isInteger(query)) {
                int key = Integer.parseInt(query);
                sb.append(logMap.get(key)).append("\n"); // 정수 -> 문자열
            } else {
                sb.append(reverseMap.get(query)).append("\n"); // 문자열 -> 정수
            }
        }

        // 결과 출력
        System.out.println(sb.toString());
    }

    // 입력값이 정수인지 확인하는 메서드
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
