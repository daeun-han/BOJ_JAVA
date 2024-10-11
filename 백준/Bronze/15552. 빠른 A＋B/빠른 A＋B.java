import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {

//        Scanner scanner = new Scanner(System.in);
        // 코드에서 바뀐점은 딱히 parsint빼고는 없긴 함
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // Buffered가 빠른 이유: 쌓아두고 한 번에 출력 (그래서 빠름) <-> Scanner는 그때그때 출력
        
        //bufferdReader.readLine() default값이 String 값이기 때문에, Integer.parseInt를 통해 형변환 해줘야 함
        int A = Integer.parseInt(bufferdReader.readLine()); //readLine사용 위에선 IOException 예외처리 해줘야 함

        for (int i = 0; i < A; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferdReader.readLine()); // 한 줄을 기준으로 입력 받을 때 StringTokenizer 사용
            int a = Integer.parseInt(stringTokenizer.nextToken()); //첫번째 값
            int b = Integer.parseInt(stringTokenizer.nextToken()); //두번째 값
//            System.out.println(a+b); // BufferedWriter를 통해 리팩토링 해보기
            bufferedWriter.write(a+b+"\n"); // 쌓아두기만 하는 작업
            // soutln을 직접 넣어줘야함. "\n"를 통해

        }
        bufferedWriter.flush(); // 출력하는 작업
        bufferedWriter.close(); // 생략 가능
    }
}