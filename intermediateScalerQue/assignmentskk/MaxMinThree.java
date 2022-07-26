package assignmentskk;

public class MaxMinThree {
    public static void main(String[] args) {
        int num1=100;
        int num2=200;
        int num3=300;
        minMax(num1,num2,num3);
    }
    static void minMax(int a, int b, int c){
        int max=c;
        int min=b;
        if(a>b && a>c){
            max=a;
        }else if(b>a && b>c){
            max=b;
        }else if(a<b && a<c){
            min =a;
        }else if(c<a && c<b){
            min=c;
        }
        System.out.println("minimum: " + min);
        System.out.println("maximum: "+ max);
    }
}
