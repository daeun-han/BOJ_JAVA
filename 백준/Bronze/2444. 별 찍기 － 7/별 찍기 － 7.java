import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < number; i++)
        {
            for (int k = 0; k < (number-1)-i; k++)
                bufferedWriter.write(" ");
            for (int j = 0; j < 2*i+1; j++)
                bufferedWriter.write("*");
            bufferedWriter.write("\n");
        }

        for (int i = number-2; i > -1; i--)
        {
            for (int k = 0; k < (number-1)-i; k++)
                bufferedWriter.write(" ");
            for (int j = 0; j < 2*i+1; j++)
                bufferedWriter.write("*");
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
