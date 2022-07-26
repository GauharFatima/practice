package com;

public class Recursion {
//    public static void main(String[] args) {
//        //write a function that print hello world
//        message();
//    }
//    static void message(){
//        System.out.println("Hello World");
//    }
        //write a function that print number 1-5 using recursion
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){ //recursion function
        if (n==5){ //base call
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
