package com;

import java.util.ArrayList;

public class FindKInArray {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=3; i>=1; i--){
            for(int j=1; j<=5; j++){
                if(j==(i+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            System.out.print("*");
        }
    }
}
