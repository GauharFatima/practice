package assignmentskk;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner SC= new Scanner(System.in);
        int num= SC.nextInt();
        int a=0, b=1, c;
        for(int i=0; i<=num; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
