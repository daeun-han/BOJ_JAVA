import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            list.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            list.add(st.nextToken());
        }

        // 중복된 값을 확인하여 제거
        Set<String> duplicates = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for (String item : list) {
            if (!unique.add(item)) {
                duplicates.add(item); // 중복 값 수집
            }
        }

        // 중복된 값들을 리스트에서 제거
        list.removeIf(duplicates::contains); // contains 메서드는 특정 값이 duplicates에 포함되어 있는지 여부를 확인

        // List의 크기 출력
        bw.write(String.valueOf(list.size()));

        bw.flush();
        br.close();
        bw.close();
    }
}
