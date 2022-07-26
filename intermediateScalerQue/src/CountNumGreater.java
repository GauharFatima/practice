import java.util.Arrays;
import java.util.Scanner;

public class CountNumGreater {
    //count the num of elements having at least one element greater than itself

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int j=0; j<n; j++){
            arr[j]=sc.nextInt();
        }
//        int [] arr={3, -2, 6, 8, 4, 8, 5}; //7
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int count=0;
        for(int i =arr.length-1; i >= 0; i--){
            if(arr[i]>=max){
                max=arr[i];
                count++;
            }
        }
        int ans = arr.length - count;
        System.out.println(ans);

    }
}
