package com.learning;

import java.util.Scanner;

public class ConditionStm {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
//if else condition
        /*if( age > 18){
            System.out.println("Adult");
        }
       else{
            System.out.println("Invalid");
        }*/
// mod use
        /*if (x%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }*/

        // else if eg1
         /*if( a==b ){
             System.out.println("Equal");
         } else if( a<b ){
             System.out.println("a is smaller");
         } else{
             System.out.println("a is greater");
         }*/

        //else if eg2
        /*if ( button==1)
            System.out.println("hello");
        else if ( button==2)
            System.out.println("namaste");
        else if ( button==3)
            System.out.println("bonjour");
        else{
            System.out.println("invalid button");
        }*/

        //switch

        switch (button){
            case 1:System.out.println("namaste");
            break;
            case 2:System.out.println("bonjour");
            break;
            case 3:System.out.println("hello");
            break;
            default:System.out.println("invalid no");
        }
    }
}
