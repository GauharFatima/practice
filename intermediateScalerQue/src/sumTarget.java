public class sumTarget {
    public static void main(String[] args) {
        int b[]={1,2,3};
        int c=4;
        System.out.println(pairSum(b,c));
    }
    static boolean pairSum(int [] a, int k){
        int n=a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]+a[j]==k) {
                    return true;
                }
            }
        }
        return false;
    }
}
