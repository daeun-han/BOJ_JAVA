import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine()); // 한 줄씩 입력 받을 때
        int[] num = new int[N]; // 배열 선언

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 선언 순서 주의
        for (int i=0; i <num.length; i++) {
            num[i]= Integer.parseInt(stringTokenizer.nextToken()); // 공백 기준으로 입력받을 때
        }
        int v = Integer.parseInt(bufferedReader.readLine()); // 한 줄 입력

        int u = 0;
        for (int i=0; i <num.length; i++) {
            if (num[i]==v)
                u++;
        }
        bufferedWriter.write(Integer.toString(u)); // int값 출력할 때(형변환 주의)
        bufferedWriter.flush();
    }
}