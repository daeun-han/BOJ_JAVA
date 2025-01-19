import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람들을 저장할 Set
        Set<String> unheard = new HashSet<>();

        // 듣도 못한 사람 입력
        for (int i = 0; i < n; i++) {
            unheard.add(br.readLine());
        }

        // 듣보잡 저장할 리스트
        List<String> result = new ArrayList<>();

        // 보도 못한 사람 입력 및 검색
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (unheard.contains(s)) { // 듣도 못한 Set에 존재하는지 확인
                result.add(s); // 듣보잡 리스트에 추가
            }
        }

        // 결과 정렬
        Collections.sort(result);

        // 듣보잡 개수 출력
        bw.write(result.size() + "\n");

        // 듣보잡 이름 출력
        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
