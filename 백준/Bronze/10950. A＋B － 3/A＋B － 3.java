import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int a[] = new int[num];
        int b[] = new int[num];

        for (int i = 1; i < num+1; i++){
            a[i-1] = scanner.nextInt();
            b[i-1] = scanner.nextInt();
        }

        for (int i = 1; i < num+1; i++){
            System.out.println(a[i-1]+b[i-1]);
        }
    }
}