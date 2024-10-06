import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n+1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a*b;
        }

        if (sum == x)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}