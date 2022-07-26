public class PrintAllSubarrayInArray {
    public static void main(String[] args) {
        //tc=o(n^3)
        int[] a= {1,4,9};

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
//                    System.out.print(a[k] + " ");//to print each sub array
                    sum=sum+a[k];
                }
                System.out.print(sum);
                System.out.println();
            }
        }
//        System.out.println(sum);
    }
}
