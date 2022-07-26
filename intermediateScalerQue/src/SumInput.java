import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        //printing the sum of input num
//        int sum= 0;
//
//        while(n>0){
//            int i=n%10;
//            n=n/10;
//            sum=sum+i;
//        }
//        System.out.println(sum);

        //reversing the input num
        int rev=0;
        while(n>0){
            rev=rev*10 + (n%10);
            n= n/10;
        }
        System.out.print(rev);




    }
}
