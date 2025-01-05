import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String list[]=new String[N];

        for(int i=0; i<N; i++)
            list[i] = br.readLine();

        // 1. 길이가 짧은 것 부터
        // 2. 길이가 같으면 사전 순으로
        Arrays.sort(list, new Comparator<String>(){ // Arrays.sort 메서드 & Comparator를 사용하여 문자열 배열 list를 정렬
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()==s2.length())
                    return s1.compareTo(s2); // 길이가 같다면 사전 순서로 정렬
                else
                    return s1.length()-s2.length(); // 길이가 짧은 문자열을 우선
            }
        });

        // 정렬된 배열을 순회하면서 중복된 문자열을 제거하여 출력
        for(int i=0; i<N; i++) {
            if(i!=0) { // 두 번째부터는 이전 문자열과 비교하여 동일하지 않으면 출력.
                if(list[i].compareTo(list[i-1])!=0)
                    System.out.println(list[i]);
            }
            else // 첫 번째 문자열은 바로 출력
                System.out.println(list[i]);
        }
        // 입력 문자열의 개수가 많다면, HashSet을 활용하여 중복을 먼저 제거하고 정렬을 수행하면 시간과 메모리를 절약
    }
}
