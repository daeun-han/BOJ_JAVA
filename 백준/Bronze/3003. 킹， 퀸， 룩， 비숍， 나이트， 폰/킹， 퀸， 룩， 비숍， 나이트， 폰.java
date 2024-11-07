import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[6];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < 2; i++)
        {
            numbers[i] = 1 - numbers[i];
        }

        for (int i = 2; i < 5; i++)
        {
            numbers[i] = 2 - numbers[i];
        }

        numbers[5] = 8 - numbers[5];

        for (int number : numbers)
            bufferedWriter.write(number+" ");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
