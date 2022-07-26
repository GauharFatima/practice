package com;
import java.util.Scanner;
public class FiboNum {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

//        Scanner sc = new Scanner(System.in);
//        int gender= sc.nextInt();
//        int age= sc.nextInt();
//      int n= sc.nextInt();

//        if(a>b && a>c){
//            System.out.println(a);
//        }else if(b>a && b>c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }

//        if(gender==0 && age>=21){
//            System.out.println("eligible male");
//        }else if (gender==1 && age>=18){
//            System.out.println("eligible female");
//        }else {
//            System.out.println("not eligible");
//        }

//            if((gender==0 && age>=21) || (gender==1 && age>=18)){
//                System.out.println("eligible");
//            }
//            else{
//                System.out.println("not eligible");
//            }

//        if(n%3==0){
//            System.out.println("fizz");
//        }  if(n%5==0){
//            System.out.println("buzz");
//        } if (n%3==0 && n%5==0){
//            System.out.println("fizz-bugs");
//        }else{
//            System.out.println("invalid");
//        }




//
//        }
//
//
//
//
//}

