import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = bufferedReader.readLine()) != null) { // Read until EOF
            bufferedWriter.write(line + "\n");
        }
        
        bufferedWriter.flush(); // Optional, to ensure everything is written out
        bufferedWriter.close();
        bufferedReader.close();
    }
}
