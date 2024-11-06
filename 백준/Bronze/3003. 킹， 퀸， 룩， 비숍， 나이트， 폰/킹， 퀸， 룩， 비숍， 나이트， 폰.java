import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number1, number2, number3, number4, number5, number6;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        number1 = Integer.parseInt(stringTokenizer.nextToken());
        number2 = Integer.parseInt(stringTokenizer.nextToken());
        number3 = Integer.parseInt(stringTokenizer.nextToken());
        number4 = Integer.parseInt(stringTokenizer.nextToken());
        number5 = Integer.parseInt(stringTokenizer.nextToken());
        number6 = Integer.parseInt(stringTokenizer.nextToken());

        number1 = 1 - number1;
        number2 = 1 - number2;
        number3 = 2 - number3;
        number4 = 2 - number4;
        number5 = 2 - number5;
        number6 = 8 - number6;

        bufferedWriter.write(number1 + " ");
        bufferedWriter.write(number2 + " ");
        bufferedWriter.write(number3 + " ");
        bufferedWriter.write(number4 + " ");
        bufferedWriter.write(number5 + " ");
        bufferedWriter.write(number6 + " ");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
