package assignmentskk;

import java.util.Scanner;

public class CurrencyToDollar {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        double rup= sc.nextDouble();
        double dol= rup/78.3275;
        System.out.println(dol + "(Current rate of 1USD is 78.3275rupees. Rate might change in future)");
    }
}
