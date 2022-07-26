package assignmentskk;

import java.util.Scanner;

public class ProductSumDiffrence {
    public static void main(String[] args) {
//        Subtract the Product and Sum of Digits of an Integer //n=234 -> (2*3*4)-(2+3+4)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num here: ");
        int num=sc.nextInt();
        System.out.println(subtractProductAndSum(num));
    }
    static int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        while(n>0){
            int dig=n%10;
            mul=mul*dig;
            sum=sum+dig;
            n=n/10;
        }
        int result=mul-sum;
        return result;

    }
}
