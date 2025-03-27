import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    if (a + b + c == n)
                        if (a>=b+2)
                            if (a!=0&&b!=0&&c!=0)
                                if (c%2==0)
                                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}