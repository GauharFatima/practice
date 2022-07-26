package com;

import java.util.Scanner;

public class QueLargest {
    public static void main(String[] args) {

        //Q1 take 3 input, print the largest/max (one way)
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Three Input: ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

        //(2nd way)
//        int max= Math.max(c,Math.max(a,b)); //there is a math class in java which have max method which cal max
//        System.out.println("Maximum: " +max);
    }
}
