import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 선언 순서 주의

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int X = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] num = new int[N]; // 배열 선언
        for (int i=0; i <num.length; i++) {
            num[i]= Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i=0; i <num.length; i++) {
            if (num[i]<X)
                bufferedWriter.write(num[i] +" ");
        }
        bufferedWriter.flush();
    }
}