import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int add = 0;
        int min = n;

        for (int i = m; i <= n; i++){
            int criteria = 0;

            if (i < 2)
                continue;

            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    criteria++;
            }
            if (criteria == 0){
                if (i < min)
                    min = i;
                add+=i;
            }
        }

        if (add == 0)
            bw.write("-1");
        else {
            bw.write(add+"\n");
            bw.write(String.valueOf(min));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
