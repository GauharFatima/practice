package com;

import java.util.Scanner;

public class LoopsQuestions {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Amount: ");

        //Q1 adding in salary
//        int salary= input.nextInt();
//        //if
//        if(salary > 10000){
//            salary+=2000;
//        } else if (salary > 20000) {
//            salary+=3000;
//        }else{
//            salary+=1000;
//        }
//        System.out.println("Increased Salary: " +salary);

        //Q2 for loop simple que print 1 to n
//        int n= input.nextInt();
//        for (int i = 1; i <=n; i++) {
//            System.out.println(i);
//        }

        //Q3 solve same for que in while loop
//        int n= input.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            i++;
//        }

        //solve same que in do while loop
        int n= input.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
