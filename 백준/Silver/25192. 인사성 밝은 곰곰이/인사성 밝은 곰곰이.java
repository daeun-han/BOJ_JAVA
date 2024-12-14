import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> uniqueUsers = new HashSet<>(); // 중복 체크를 위한 Set
        int count = 0; // 인사 횟수

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                // 세션 초기화
                uniqueUsers.clear();
            } else {
                // 새로운 사용자라면 카운트 증가
                if (!uniqueUsers.contains(input)) {
                    count++;
                }
                uniqueUsers.add(input);
            }
        }

        System.out.println(count);
    }
}