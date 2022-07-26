package assignmentskk;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the here to check if its a leap year or not : ");
        int year = sc.nextInt();
        System.out.println(isLeapOrNot(year));
    }
    static boolean isLeapOrNot(int x){
        if(x%100==0  &&  x%400==0){
           return true;
        }else if(x%100!=0  &&  x%4==0){
            return true;
        }
        return false;
    }
}
