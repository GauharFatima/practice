import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) {

//        int [][] A = new int [3][3];
//        int [][] B= new int [3][2];

        int [][] A= {   {1,2,3},
                        {4,5,6},
                        {7,8,9},};
        int [][] B= { {1,2},
                      {3,4},
                      {5,6},};
//        int [][] C = matrixMultiply( A , B);
        int [][] C = new int [3][2];
        System.out.println(Arrays.toString(matrixMultiply( A , B)));

//        for(int[] nums : C){
//            System.out.println(Arrays.toString(matrixMultiply( A , B)));
//        }
//        System.out.println();

    }
    static int [][] matrixMultiply( int [][] A , int [][] B){

		 //for clearity length of row n col of all three array

//        int rowA = A.length;
		int colA = A[0].length;

//		int rowB = A[0].length;
//		int colB = B[0].length;


        int rowC = A.length;
        int colC = B[0].length;
        int [][] C = new int [rowC][colC];

        //loop for the row of the product matrix
        for(int row = 0; row < rowC; row++){

            //loop for the col of the product matrix
            for(int col =0; col < colC; col++){

                //initiating sum as 0
                int sum =0;

                //loop to iterate in the row(n) and col of the
                //colA==rowB so we can use any of then to iterate in the loop
                for(int i =0; i < colA; i++){

                    //logic for the multiplication
                    sum = sum + A[row][i] * B[i][col];
                }

                //assigning the value to C[row][col]
                C[row][col] = sum;
                System.out.println(C[row][col]);
            }
        }

        return C;
    }
}
