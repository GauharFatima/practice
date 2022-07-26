package assignmentskk;

public class EvenOddFunction {
    public static void main(String[] args) {
        int n1=1234;

        System.out.println(evenOrOdd(n1));
    }
//Define a program to find out whether a given number is even or odd.
    static String evenOrOdd(int n1) {
        String ans="";
        if(n1%2==0){
            ans="Its Even number.";
        }else if(n1==0){
            ans="Its a Zero.";
        }else{
            ans="Its an Odd number.";
        }
        return ans;
    }
}
