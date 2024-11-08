import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toUpperCase(); // 입력을 받고 대문자로 변환
        br.close();

        int[] alphabetCount = new int[26]; // 알파벳 개수를 저장할 배열, 영문자의 개수는 26개

        for (int i = 0; i < input.length(); i++) {
            alphabetCount[input.charAt(i) - 'A']++; // 알파벳의 개수를 증가
        }

        int maxCount = 0; // 최대 개수를 저장할 변수
        char mostFrequentChar = '?'; // 가장 많이 등장한 알파벳을 저장할 변수

        // 배열을 탐색하여 가장 많이 등장한 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                mostFrequentChar = (char) (i + 'A'); // 가장 많이 사용된 알파벳 갱신
            } else if (alphabetCount[i] == maxCount) {
                mostFrequentChar = '?'; // 동일한 빈도수가 발견되면 '?'로 변경
            }
        }

        System.out.println(mostFrequentChar); // 결과 출력
    }
}
