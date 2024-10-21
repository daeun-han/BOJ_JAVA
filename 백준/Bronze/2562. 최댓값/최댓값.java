import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9]; // 배열 선언
        for (int i=0; i <num.length; i++) {
            num[i]= Integer.parseInt(bufferedReader.readLine());
        }

        int max = num[0];
        int n = 1;

        for (int i=0; i <num.length; i++) {
            if (max<num[i]) {
                max = num[i];
                n = i+1;
            }
        }
        bufferedWriter.write(max+"\n"+n);
        bufferedWriter.flush();
    }
}