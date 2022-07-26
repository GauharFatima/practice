public class ReverseArrayConstantSC {
    public static void main(String[] args) {
        int [] a={-1, 4, 7, 6, 5, -2, 12,8};
        //rev={8, 12, -2 , 5, 6, 7, 4, -1};
        System.out.println(reverseArray(a));

//        int a[][]={{2, 3, 4, 1},
//                {6, 2, 0, 5},
//                {9, 3, 1, 7},
//                {2, 2, 8, 3}};
//
    }
    static int[] reverseArray(int[] a){
        int n= a.length;
        int temp=0;
        int i=0,j=n-1;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
//            System.out.println(a[i]);
            a[j]=temp;
//            System.out.println(a[j]);
            i++;
            j--;
        }
        System.out.println(a);
        return a;
    }
}
