import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUM HERE: ");
        int n= sc.nextInt();

        //q1  print * square n*n times
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");// to print starts in each line
//            }
//            System.out.println();// to print next line
//        }

        //q2 reverse triangle
//       for(int i=1; i<=n; i++){
//            for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //q3 triangle

//        for (int i= 1; i<=n; i++){
//            for (int j= 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //q4 star space star
//        for(int i= 1; i<=n; i++){
//            System.out.print("*");
//            for(int j=1; j<=(n-1); j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
//        }

        //q5 star space dec star
//        for(int i=1;i<=n; i++){
//            System.out.print("*");
//            for(int j=1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
//        }
    }
}
