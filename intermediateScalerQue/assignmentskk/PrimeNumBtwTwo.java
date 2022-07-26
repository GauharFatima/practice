package assignmentskk;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumBtwTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers(First Input should be SMALLER than Second): ");
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(primeNumBtwTwoInput(n1,n2));

    }
//    Write a function that returns all prime numbers between two given numbers.
    static ArrayList<Integer> primeNumBtwTwoInput(int x, int y){
        ArrayList<Integer> pn = new ArrayList<Integer>();
         for(int i=x; i<=y; i++ ){
             int count =0;
             for(int j=1; j<=y; j++){
                 if(i%j==0){
                     count++;
                 }
             }
             if(count==2){
                 pn.add(i);
             }

         }
         return pn;
    }
}
