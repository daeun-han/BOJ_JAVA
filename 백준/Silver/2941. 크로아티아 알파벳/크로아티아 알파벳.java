import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        br.close();

        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : croatianAlphabet) {
            input = input.replace(pattern, "*");
        }

        System.out.println(input.length());
    }
}
