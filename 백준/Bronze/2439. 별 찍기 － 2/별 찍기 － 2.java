import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        for (int i = 1; i < A+1; i++){
            for (int K = A-i; K > 0; K--)
                System.out.print(" ");
            for (int j = 1; j < i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}