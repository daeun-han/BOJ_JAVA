import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong((br.readLine()));

        bw.write((n-2)*(n-1)*n/6 +"\n"+"3");
        bw.flush();
        bw.close();
    }
}
