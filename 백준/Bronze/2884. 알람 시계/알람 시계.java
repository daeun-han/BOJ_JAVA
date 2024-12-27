import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b > 45)
            System.out.println(a+" "+(b-45));
        else if (b == 45)
            System.out.println(a+" "+0);
        else {
            if (a==0){
                System.out.println(23 + " " + (b + 15));
                return;
            }
            System.out.println((a - 1) + " " + (b + 15));
        }
    }
}