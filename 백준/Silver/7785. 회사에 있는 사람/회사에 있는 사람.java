import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> logMap = new HashMap<>(); // 사람의 상태를 저장할 맵

        // 로그 데이터 입력
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];

            if (action.equals("enter")) {
                logMap.put(name, "enter");
            } else if (action.equals("leave")) {
                logMap.remove(name);
            }
        }

        // 현재 회사에 남아 있는 사람들 정렬
        List<String> result = new ArrayList<>(logMap.keySet());
        Collections.sort(result, Collections.reverseOrder()); // 사전 역순 정렬

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (String name : result) {
            sb.append(name).append("\n");
        }
        System.out.println(sb.toString());
    }
}
