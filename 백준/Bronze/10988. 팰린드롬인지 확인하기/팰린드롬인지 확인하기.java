import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bufferedReader.readLine();
        boolean isPalindrome = true;

        // 회문 검사
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 회문이면 1, 아니면 0
        if (isPalindrome) {
            bufferedWriter.write("1");
        } else {
            bufferedWriter.write("0");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}