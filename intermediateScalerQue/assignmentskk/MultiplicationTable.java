package assignmentskk;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//        Take a number as input and print the multiplication table for it.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num here : ");
        int num= sc.nextInt();
        tableOf(num);
    }
    static void tableOf(int n){
        int mul=1;
        for(int i=1; i<11; i++){
            mul=n*i;
            System.out.println(n + " " + "*" + " " + i + " " + "= " + mul);
        }
    }
}
