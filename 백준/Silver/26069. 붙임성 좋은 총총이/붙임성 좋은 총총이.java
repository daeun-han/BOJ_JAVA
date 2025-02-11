import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> dancing = new HashSet<>(); // 집합(Set)을 활용하여 춤을 출 수 있는 사람을 관리.
        dancing.add("ChongChong"); // 처음 춤을 추는 사람

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            // A 또는 B 중 한 명이 춤을 추고 있다면 둘 다 추가
            if (dancing.contains(A) || dancing.contains(B)) {
                dancing.add(A);
                dancing.add(B);
            }
        }

        bw.write(dancing.size() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
