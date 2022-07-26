package com;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        //Q1 print character at the 0th index, without taking input
//        String ch= "Gauhar";
//        System.out.println(ch.charAt(0)); //will print-G

        //taking input
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter Here: ");
//        char c= in.next().trim().charAt(0);//what ever word will be input the 0th char will be printed
        //trim-remove extra space before a word or line,use while taking input
//        System.out.println(c);


        // or and use in code
//        int a=10;
//        int b=20;
//        if(a==10 && b==20){ //both cond have to be true
//            System.out.println("AND condition");
//        }
//        if( a==10 || b==10){ // either one of them will be true
//            System.out.println("OR condition");
//        }

        //Q2 tell the case type of char input at()th index
         Scanner in = new Scanner(System.in);
         System.out.print("Enter: ");
         char c= in.next().trim().charAt(1);

         if(c>='a' && c<='z'){
             System.out.println("lower case");
         }else{
             System.out.println("upper case");
         }


    }
}
