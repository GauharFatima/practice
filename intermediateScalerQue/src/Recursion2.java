package com.learning;

public class Recursion2 {

    public static void main(String[] args) {
      int a[] = {1, 2, 3, 5, 7,4,1,3,1};
      int count =0;

      for( int item: a ){
          count++ ;
//          System.out.println(item);
      }
        System.out.println(count);
    }
}
