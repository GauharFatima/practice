package com;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter: ");

        //array of primitive
//        int[] arr = new int[5];
        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); // 1st way

//       for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");  //2nd way
//        }
//       for (int num : arr) { //for every element in array print element
//            System.out.print(num + " ");// here num represent element  //3rd way by-- enhance for loop
//        }
        //array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
            System.out.print(Arrays.toString(str));
        }
    }