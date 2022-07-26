package com;

import java.util.Scanner;

public class BasicQuestion1 {

//    take input name print hello name
//   public static void main(String[] args){
//    Scanner sc= new Scanner(System.in);
//    String name= sc.nextLine();
//
//       System.out.println(name+ " Hello");

    //    take input number check is it a prime number or not
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //eg1 n=36 ,eg2 n=17

        if (n <= 1) {  //36<=1 false , 17<=1 false
            System.out.println("neither prime nor composite"); // not print this , will move to next line , same
        }
        int i = 2;  //i=2 , i=2..i=3..i=4..i=5
        while (i*i < n) {  //(2*2=)4<36 true  , 4<17 true..6<17 true..16<17 true..25<17 false, now it will stop here as condition is not fulfill and exit while loop

        //checking till the square root of the number entered/square root method(1)[n*n means square root of n]

            if (n % i == 0) {  //36 % 4 = 0 true  , 17 % 4 = 0 false..17%6=0 false..17%16=0 false
                System.out.println(" Not Prime Number");  //this will be printed  , will not print this..same..same
                return; // will stop here as we found this is not prime  , exit from this loop..same..same
            }
            i = i + 1;  // (for eg2) i=3 return to while condition again..now i=4 same..now i=5 same

            // checking prime use basic/normal method(2)

//            if(n%i==0){
//                System.out.println("not prime");
//                return;
//            }
//            i++;
        }
        System.out.println("Prime Number"); // and print prime number(for eg2)
   }
}
