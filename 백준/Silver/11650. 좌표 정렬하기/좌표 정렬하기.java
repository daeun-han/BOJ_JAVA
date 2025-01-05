import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int[][] arrays = new int[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arrays[i][0] = Integer.parseInt(st.nextToken());
            arrays[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        // Arrays.sort 사용 -> arrays는 2차원 배열, 각 요소는 [x, y] 형태의 1차원 배열. 이 메서드는 배열을 정렬하기 위해 Comparator(두 요소(num1과 num2)를 비교해 정렬 기준을 정의)를 사용
        Arrays.sort(arrays, (num1, num2) -> { // (num1, num2) -> { ... } (람다 함수)
            return num1[0]!=num2[0] ? num1[0]-num2[0] : num1[1]-num2[1]; // 두 배열의 첫 번째 원소가 다르면, **num1[0] - num2[0]**를 반환하여 첫 번째 원소를 기준으로 오름차순 정렬,, num1[0] < num2[0]이면 음수가 반환되므로 num1이 먼저
            // num1[0] == num2[0]: 두 배열의 첫 번째 원소가 같으면, **num1[1] - num2[1]**를 반환하여 두 번째 원소를 기준으로 오름차순 정렬
        });

        for(int i = 0; i < N; i++){
            bw.write(arrays[i][0] + " " + arrays[i][1] +"\n");
        }

        bw.flush();
        bw.close();
    }
}