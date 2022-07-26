import java.util.Scanner;

public class PairSumEqualsToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int [] arr={3, -2, 1, 4, 3, 6, 8};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
