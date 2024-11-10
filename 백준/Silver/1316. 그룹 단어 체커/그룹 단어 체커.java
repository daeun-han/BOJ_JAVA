import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());  // 단어의 개수 입력 받기

        String[] text = new String[a];
        for (int i = 0; i < a; i++) {
            text[i] = br.readLine();  // 각 단어 입력 받기
        }

        int count = 0;

        for (String word : text) {
            Set<Character> spelling = new HashSet<>();  // 매 단어마다 새로운 집합 생성
            boolean isGroupWord = true;  // 그룹 단어 여부를 판단하는 변수

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                // 현재 문자가 집합에 있고, 이전 문자와 다르다면 그룹 단어가 아님
                if (spelling.contains(currentChar) && word.charAt(j - 1) != currentChar) {
                    isGroupWord = false;
                    break;
                }

                spelling.add(currentChar);  // 집합에 문자 추가
            }

            if (isGroupWord) {
                count++;  // 그룹 단어일 경우 카운트 증가
            }
        }

        System.out.println(count);
    }
}
