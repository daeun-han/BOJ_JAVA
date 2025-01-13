import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2]; // 나이와 이름 저장 배열

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken(); // 나이
            members[i][1] = st.nextToken(); // 이름
        }

        // 정렬 기준: 나이를 기준으로 오름차순
        Arrays.sort(members, (m1, m2) -> Integer.parseInt(m1[0]) - Integer.parseInt(m2[0]));

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
