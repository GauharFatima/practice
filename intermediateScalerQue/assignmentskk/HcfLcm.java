package assignmentskk;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
//        Take 2 numbers as inputs and find their HCF and LCM.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two nums : ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        hcfAndLcm(num1,num2);
    }

     static void hcfAndLcm(int n1, int n2) {
        int min = Math.min(n1,n2);
        int hcf=1;
        int lcm=1;
        for(int i=min; i>0; i--){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                break;
            }
        }
        lcm=(n1*n2)/hcf;
         System.out.println("HCF of number is : " + hcf + " and" + " LCM of number is : " + lcm);
    }
}
