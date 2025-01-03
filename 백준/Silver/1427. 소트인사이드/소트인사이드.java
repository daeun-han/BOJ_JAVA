import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        String[] list = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            list[i] = Character.toString(arr[i]);
        }
        Arrays.sort(list, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(list[i]);
        }
        br.close();
    }
}