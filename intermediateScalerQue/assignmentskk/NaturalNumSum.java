package assignmentskk;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num to know the sum of first natural numbers till num: ");
        int num=sc.nextInt();
        System.out.println(sumOfFirstNNaturalNum(num));

    }
//    Write a function that returns the sum of first n natural numbers. //1,2,3,4,5.... except zero
    static int sumOfFirstNNaturalNum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
