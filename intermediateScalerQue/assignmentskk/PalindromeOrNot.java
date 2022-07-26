package assignmentskk;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not. // madam -> madam reverse is also same as original
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word here : ");
        String s=sc.next();
        System.out.println(isPalindromeOrNot(s));

    }
    static boolean isPalindromeOrNot(String str){
        int n=str.length();
        int i=0,j=n-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
