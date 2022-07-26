package com;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TypeCasting { /* if one type of data(e.g. float) is assigned to another type of variable(e.g. int)
    automatically a type conversion will take place if 1- the two type of variable is compatible(like a char
    cannot be converted into a float or int) 2- destination type should be greater than source type(like float
    is greater than int) */

    //Narrow Conversion-converting greater type into smaller(e.g. float is bigger than int but can be narrowed into int)
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float num= input.nextFloat(); // if here input is int the that will be converted into float e.g. input 65
        System.out.println(num); // will print float 65.0

    /* Type Casting-Converting the bigger number into smaller by putting the data in--> () and also writing the
        type before it */
        int n= (int) (165.87f);
        System.out.println(n);

     //Automatic type promotion in expression
        int a=257;  //if you give more the number than it can handle,it will give the reminder
        byte b=(byte)(a);  //e.g. byte size is 256 while a=257,b output remainder as a>b

        System.out.println(b);  //257 % 256 = 1 will print

    //a byte evaluation automatically converts into int
        byte e = 40;
        byte c = 50;
        byte d = 100;
        int f = e*c/d; //no error because here you already tell type as int
//        byte x = 54;
//         x= x*8; //error,because now x is int *reason stated above*
        System.out.println(f);

        int i= 'A'; //assigning a char to int
        System.out.println(i); //will print the numeric value of 'A' (typeConversion)


    }
}
