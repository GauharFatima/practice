import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc. nextInt();

        //pattern 1
//        for ( int i= 1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                if(j%2!=0){
//                    System.out.print(j);}
//                else{
//                    System.out.print("*");}
//            }
//            System.out.println();
//        }
//
//        //pattern 2
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i-1; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      //pattern 3 (1)
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }for(int k=1; k<=i-1; k++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i-1; k++){
//                System.out.print(" ");
//            }
//              for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    //pattern 3 (2)
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }for(int k=1; k<=2*(i-1); k++){ //before
//                System.out.print(" ");
//            }
//            for(int j=1; j<=(n-i+1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
  //pattern 4
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            for(int k=1; k<=n-i; k++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=n-i; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
   //pattern 5
        //1st big loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" "); //1 space
            }
            for(int sp=1; sp<=n-i; sp++){ //2 space
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){ //2 star
                    System.out.print("*");
            }
            for (int s=1; s<=i-1; s++){ //4 star
                System.out.print("*");
            }
            for(int sp=1; sp<=n-i; sp++){ //4 space
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){ //3 space
                System.out.print(" ");
            }
            System.out.println(); //next line
        }
        //2nd big loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){  //5 space
                System.out.print(" ");
            }
            for(int k=1; k<=(n-i+1); k++){ //5 star
                System.out.print("*");
            }
            for( int s2=1; s2<=(n*2-1); s2++){ //6 star
                System.out.print("*");
            }
            for(int k=1; k<=(n-i+1); k++){ //7 star
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++){  //7 space
                System.out.print(" ");
            }
            System.out.println();
        }
        //3rd big loop
        for(int i=1; i<=n; i++) {
            for(int sp=1; sp<=n-i; sp++){ //8 space -->same as 2 space
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){ //8 star -->same as 2 star
                System.out.print("*");
            }
            for( int s2=1; s2<=(n*2-1); s2++){ //9 -->same as  6 star
                System.out.print("*");
            }
            for(int s=1; s<=i; s++){ //10 -->same as 2 star
                System.out.print("*");
            }
            for(int sp=1; sp<=n-i; sp++){ //10 -->same as 2 space
                System.out.print(" ");
            }
           System.out.println();
        }
        //4 big loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" "); //11 -->same as 1 space
            }
            for(int j=1; j<=i-1; j++){  //12 -->same as 5 space
                System.out.print(" ");
            }
            for(int k=1; k<=(n-i+1); k++){ //12 -->same as 5 star
                System.out.print("*");
            }
            for(int sp=1; sp<=n-i; sp++){ //13 -->same as 4 star
                System.out.print("*");
            }
            for (int s=1; s<=i-1; s++){ //13 -->same as 4 space
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(" "); //14 -->same as 1,3,11 space
            }
            System.out.println();
        }


    }
}
