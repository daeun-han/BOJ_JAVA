import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력: 숫자 카드 개수
        int n = Integer.parseInt(br.readLine());

        // 입력: 숫자 카드 목록
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cardCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        // 입력: 쿼리 개수
        int m = Integer.parseInt(br.readLine());

        // 입력: 쿼리 숫자 목록
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(cardCount.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
