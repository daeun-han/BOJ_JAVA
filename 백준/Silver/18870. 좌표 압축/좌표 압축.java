import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] coords = new int[N];
        int[] sortedCoords = new int[N];

        // 좌표 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coords[i] = Integer.parseInt(st.nextToken());
            sortedCoords[i] = coords[i];
        }

        // 정렬
        Arrays.sort(sortedCoords);

        // 중복 제거된 좌표 압축 매핑 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int coord : sortedCoords) {
            if (!map.containsKey(coord)) {
                map.put(coord, rank++);
            }
        }

        // 결과 생성
        StringBuilder sb = new StringBuilder();
        for (int coord : coords) {
            sb.append(map.get(coord)).append(" ");
        }

        System.out.println(sb);
    }
}
