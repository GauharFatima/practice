public class AntiDiognalArray {
    public static void main(String[] args) {
        int [][]A={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int rowA=A.length; //n
        // int ansCol=(2*row)-1;//m
//        int [][] ans=new int [(2*rowA)-1][rowA];//m,n
        for(int ansRow=0; ansRow<(2*rowA)-1; ansRow++){//i=0,i<m,i++
            //iterating over the rows of A[][]
            for(int row=0; row<rowA; row++){//j=0,j<n;j++
                //iterating over cols of A[][]
                for(int col=0; col<rowA; col++) {//k=0; k<n;k++
                    if ((row + col) == ansRow && ansRow < rowA) {
//                        ans[ansRow][row]=A[row][col];
                        System.out.print(A[row][col] + " ");
                    } else if ((row + col) == ansRow && ansRow >= rowA) {
//                        ans[ansRow][row-row--]=A[row][col];
                        System.out.print(A[row][col] + " ");
                    }
//
                }
            }
            System.out.println();
        }
//        return ans;
    }
}
