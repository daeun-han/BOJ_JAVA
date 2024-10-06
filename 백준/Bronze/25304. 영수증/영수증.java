import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static int input(int n) {
        int sum = 0;

        for (int i = 1; i < n+1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a*b;
        }
        return sum;
    }

    public static void check(int sum, int x) {
        if (sum == x)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static void main(String args[]){
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = input(n);

        check(sum, x);
    }
}