import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] num = new int[N]; // 배열 선언
        for (int i=0; i <num.length; i++) {
            num[i]= Integer.parseInt(stringTokenizer.nextToken());
        }

        int min = num[0];
        int max = num[0];

        for (int i=0; i <num.length; i++) {

            if (min>num[i])
                min = num[i];

            else if (max<num[i])
                max = num[i];
        }
        bufferedWriter.write(min+" "+max);
        bufferedWriter.flush();
    }
}