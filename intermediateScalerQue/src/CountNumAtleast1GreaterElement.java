public class CountNumAtleast1GreaterElement {
    public static void main(String[] args) {
//        int[] a={2, 5, 1, 4, 8, 0, 8, 1, 3, 8}; //ans=7
//        int[] a={-3, -2, 6, 8, 4, 8, 5}; //ans=5
//        System.out.println(countOfNumAtleastOneGreater(a));
//       int  A = 9;
//       int  B = 78;
        int[] C = {7, 1, 8, 5, 8, 5, 3, 3, 5 };
//        System.out.println(maxSubarray(A,B,C));
        System.out.println(getCount(C));

    }
    //approch1
//    static int countOfNumAtleastOneGreater(int[] a) {
        //tc=o(n), sc=o(1)
//        int max=a[0];
//        int count=0;
//        int n=a.length;
//        //finding the max element;
//        for(int i=0; i<n; i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        //count of max;
//        for(int i=0; i<n; i++){
//            if(a[i]==max){
//                count++;
//            }
//        }
//        int ans=n-count;
//        return ans;
//    }
//    //approch2
//       static int maxSubarray ( int A, int B, int[] C){
//            int sum = 0;
//            int newsum = 0;
//            if (A == 1 && A < B) {
//                return C[0];
//            } else if (A == 1 && A > B) {
//                return 0;
//            }
//            for (int i = 0; i < A; i++) {
//                for (int j = i; j < A; j++) {
//                    sum += C[j];
//                    if (sum > B) {
//                        return 0;
//                    } else if (newsum < sum) {
//                        newsum = sum;
//                    }
//                }
//            }
//            return newsum;
//        }

    //optimal approch
    static int getCount(int [] a){
        int n= a.length;
//        int count=0;
        int newcount=0;
        int max=Integer.MIN_VALUE;
        int oldmax=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>=max){
                oldmax=max;
                max=a[i];
//                count++;
                if(oldmax==a[i]){
                    newcount+=2;
                }
            }
        }
        return n-newcount;
    }
}
