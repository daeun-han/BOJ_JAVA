import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] A = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length() && j < 15; j++) {
                A[i][j] = String.valueOf(line.charAt(j));
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (A[i][j] != null) {
                    bw.write(A[i][j]);
                }
            }
        }

        bw.flush();
    }
}
