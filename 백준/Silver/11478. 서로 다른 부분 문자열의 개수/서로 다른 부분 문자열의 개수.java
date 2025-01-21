import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        // HashSet은 중복된 값을 저장 X
        HashSet<String> uniqueSubstrings = new HashSet<>();

        // '부분 문자열(substring)'을 생성하고 이를 HashSet에 추가하여 중복을 제거하는 역할
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                uniqueSubstrings.add(input.substring(i, j));
                // substring 메서드는 i부터 j까지의 문자열을 반환

                //예를 들어, input = "abc"일 때:
                //i = 0, j = 1 → input.substring(0, 1) = "a"
                //i = 0, j = 2 → input.substring(0, 2) = "ab"
                //i = 0, j = 3 → input.substring(0, 3) = "abc"

                //uniqueSubstrings.add(...)는 중복 제거
            }
        }

        //input = "abc"
        //루프 실행:
        //i = 0 (시작 위치가 0일 때):
        //j = 1 → input.substring(0, 1) = "a"
        //j = 2 → input.substring(0, 2) = "ab"
        //j = 3 → input.substring(0, 3) = "abc"

        //i = 1 (시작 위치가 1일 때):
        //j = 2 → input.substring(1, 2) = "b"
        //j = 3 → input.substring(1, 3) = "bc"

        //i = 2 (시작 위치가 2일 때):
        //j = 3 → input.substring(2, 3) = "c"

        //HashSet에 저장된 값: ["a", "ab", "abc", "b", "bc", "c"]

        bw.write(String.valueOf(uniqueSubstrings.size()));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
