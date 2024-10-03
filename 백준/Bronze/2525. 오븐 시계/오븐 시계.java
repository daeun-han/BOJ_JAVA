import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 재풀이
        int totalMinutes = a * 60 + b + c;

        int hour = (totalMinutes / 60) % 24;
        int minute = totalMinutes % 60;

        System.out.println(hour + " " + minute);

        // 최초 코드
//        if ( b + c < 60) {
//            System.out.println(a + " " + (b + c));
//        }
//        else if (b + c == 60){
//            if ((a+1)==24){
//                System.out.println(0 + " " + b);
//                return;
//            }
//            System.out.println((a+1) + " " + b);
//        }
//        else { // (b + c > 60)
//
//            int d = (a+((b+c)/60));
//            int e = ((b+c)%60);
//
//            if (d>=24) {
//                System.out.println((d - 24) + " " + e);
//                return;
//            }
//
//            System.out.println(d + " " + e);
//        }
    }
}