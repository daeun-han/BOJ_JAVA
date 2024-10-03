import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a==b || a==c){
            if ( b==c ){
                System.out.println(10000+a*1000);
                return;
            }
            System.out.println(1000+a*100);
        }
        else if (b==c)
            System.out.println(1000+b*100);
        else{
            int max = a;

            if (a < b){
                max = b;
                if ( b < c )
                    max = c;
            }
            else if ( a < c )
                max = c;

            System.out.println(100*max);

        }
    }
}