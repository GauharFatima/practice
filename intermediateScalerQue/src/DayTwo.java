import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {

        //que 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a >= b && a >= c) { //>= is use if two equal num are input then anyone will be taken
//            System.out.println(a);
//        } else if (b >= a && b >= c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//
//        if(a>b && a>c){
//            System.out.println(a);
//        }else if(b>a && b>c){
//            System.out.println(b);
//        }
//        else{
//            System.out.println(c);
//        }

            //que 1
//        if(a==1){
//            System.out.println("January");
//        }
//        else if(a==2){
//            System.out.println("February");
//        }else if(a==3){
//            System.out.println("March");
//        }else if(a==4){
//            System.out.println("April");
//        }else if(a==5){
//            System.out.println("May");
//        }else if(a==6){
//            System.out.println("June");
//        }else if(a==7){
//            System.out.println("July");
//        }else if(a==8){
//            System.out.println("August");
//        }else if(a==9){
//            System.out.println("September");
//        }else if(a==10){
//            System.out.println("October");
//        }else if(a==11){
//            System.out.println("November");
//        }else if(a==12){
//            System.out.println("December");
//        }
//        else{
//            System.out.println("Invalid Input");
//        }

            //self made que
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a<b){
//            System.out.println(b);
//        }
//        else{
//            System.out.println(a);
//        }


            //que 4
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if(a==1){
//            System.out.println(31);
//        }else if(a==2){
//            System.out.println(28);
//        }else if(a==3){
//            System.out.println(31);
//        }else if(a==4){
//            System.out.println(30);
//        }else if(a==5){
//            System.out.println(31);
//        }else if(a==6){
//            System.out.println(30);
//        }else if(a==7){
//            System.out.println(31);
//        }else if(a==8){
//            System.out.println(31);
//        }else if(a==9){
//            System.out.println(30);
//        }else if(a==10){
//            System.out.println(31);
//        }else if(a==11){
//            System.out.println(30);
//        }else if(a==12){
//            System.out.println(31);
//        }
//        else{
//            System.out.println("Invalid Input");
//        }

      // practice que 1
//        int a = 12;
//        int b = 2;
//        System.out.println(a/b);

        //pq 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if(a%2 ==0 ){
//            System.out.println(0);
//        }
//        else{
//            System.out.println(1);
//        }

        //pq 5
//        Scanner sc= new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//
//        if(a+b+c==180){
//            System.out.println("Valid");
//        }else{
//            System.out.println("Not Valid");
//        }

        //pq 8
//        Scanner sc=new Scanner(System.in);
//        int c=sc.nextInt();
//        int s=sc.nextInt();
//
//        if(s>c){
//            System.out.println(1);
//            System.out.println(s-c);
//        }
//        else{
//            System.out.println(-1);
//        }

        //pq 9
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a==b & a==c){
//            System.out.println("equilateral");
//        }else if(a==b || b==c || c==a){
//            System.out.println("isosceles");
//        }
//        else{
//            System.out.println("scalene");
//        }

        //pq 10
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if(a>=1){
//            System.out.println(1);
//        }else if(a<0){
//            System.out.println(-1);
//        }
//        else{
//            System.out.println(0);
//        }

        //pq 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int type = sc.nextInt();
        int amount = sc.nextInt();

        if(type==1){
            System.out.println(n+amount);
        }else if(n<amount){
            System.out.println("Insufficient Funds");
        }
        else{
            System.out.println(n-amount);
        }


        }
    }
