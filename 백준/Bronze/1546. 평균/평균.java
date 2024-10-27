import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        double m = Integer.parseInt(bufferedReader.readLine());

        double[] num = new double[(int) m]; // 배열 선언

        double max = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i < num.length; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (max<num[i])
                max=num[i];
        }

        double sum = 0;

        for (int i=0; i <num.length; i++) {
            sum += (num[i]/max)*100;
        }

        sum = sum/m;

        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
    }
}