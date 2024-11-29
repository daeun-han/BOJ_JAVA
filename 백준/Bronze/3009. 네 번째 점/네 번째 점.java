
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());


        stringTokenizer = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int h = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int c,d;

        if (x==w)
            c=a;
        else if (x==a) {
            c=w;
        }
        else
            c=x;

        if (y==h)
            d=b;
        else if (y==b) {
            d=h;
        }
        else
            d=y;

        bw.write(c+" "+d);

        bw.flush();
        bw.close();
        br.close();
    }
}
