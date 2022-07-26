package com;

import java.util.Arrays;
// code for making changes by calling function
public class PassingInFunction {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] num) {
        num[2]=33;
    }

}
