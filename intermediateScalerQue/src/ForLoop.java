import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();

        //print 1 to a
//        for(int i=1; i<=a; i++){
//            System.out.print(i +" ");
//        }

        //print factors of a
//        for(int i=1 ;i<=a ; i++){
//            if(a%i==0){
//                System.out.println(i);
//            }
//        }

        //prime num from 1 to n
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();

//        int count=0;
//        int x =a/2;
//        for(int i=1 ; i<x ; i++ ){
//            if(a%i==0){
//                count++;
//                System.out.println(i);
//            }
//            if(count==2){
//                System.out.println(a + "pm");
//            }
//        }

//        for(int i=1 ; i<=n ; i++ ){
//            if(n%n==0 && n%1==0){
//                System.out.println(n);
//            }else{

        int rev=0;
        while(A>0){
            rev= rev*10 + (A%10);
            A= A/10;
            if(rev==A){
                System.out.print("True");
            }else{
                System.out.print("False");
            }

        }
//        if(rev==A){
//            System.out.print("True");
//        }else{
//            System.out.print("False");
//        }

    }

}

