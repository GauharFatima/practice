package com.learning;

public class ArrayComRef {
    public static void main(String[] args) {
        int array[] = new int[4];
        for(int i=0; i<4; i++){
            System.out.println(i);
        }

        int num []= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Element on 4th index is " + num[4]);

//        average of array value
        int num1[] = {2,3,4,6,9,19,16,5};
        double result= 0;
        for(int i=0 ; i<num1.length ; i++){
            result= result + num1[i];
         }
        System.out.println(result/num1.length);


    }
}
