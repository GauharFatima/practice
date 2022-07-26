import java.util.Scanner;

public class HwQ2Day4 {
    public static void main(String[] args) {
        //you are given two integers A and B. You have to find the value of A^B.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int mul=1;
        int i=1;
        while(i<=b){
            mul=mul*a;
            i++;
        }
        System.out.println(mul);
    }
}
