import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a==60&&b==60&&c==60) {
            bw.write("Equilateral");
        } else {
            if (a+b+c==180) {
                if (a==b||a==c||c==b)
                    bw.write("Isosceles");
                else
                    bw.write("Scalene");
            }
            else
                bw.write("Error");
        }
        bw.flush();
    }
}
