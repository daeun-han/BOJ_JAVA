import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[30]; // 배열 선언
        int value;

        for (int i = 1; i < 29; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            num[n-1] = n;
        }

        for (int i = 1; i < 31; i++) {
            if (num[i-1] == 0){
                value = i;
                bufferedWriter.write(value+"\n");
            }
            // 결과 출력
            bufferedWriter.flush();
        }
    }
}