import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 숫자 카드 개수
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        // 이분 탐색 수행 -> 탐색 시간 복잡도가 평균 O(1)인 HashSet 이용으로, 코드 간단히

        // 숫자 카드 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // 확인할 숫자 개수
        int m = Integer.parseInt(br.readLine());

        // 확인할 숫자 입력 및 탐색
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (set.contains(target)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        // 결과 출력
        System.out.println(sb.toString());
    }
}
