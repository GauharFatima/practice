public class SumOfSubarrayUsingPrefix {
    public static void main(String[] args) {
        int []a={1,4,9};
        int [] pre= new int [a.length];
        pre[0]=a[0];
        for(int i=1; i<a.length; i++){
            pre[i]=pre[i-1]+a[i];
        }
        int sum=0;
        int i=0;
        for(int j=i; j<a.length; j++){
            sum=pre[i]-pre[i-1];
            System.out.println(sum);
        }
//        System.out.printlm);
    }
}
