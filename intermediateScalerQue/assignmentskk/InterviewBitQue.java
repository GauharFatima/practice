package assignmentskk;

public class InterviewBitQue {
    public static void main(String[] args) {
        int [][] arr={{1,0,1},
                {1,1,1},
                {1,1,1}};
        ifZero(arr);

    }
//    Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0.
    static void ifZero(int [][] a){
        /*{1,0,1
           1,1,1
           1,1,1} */
        int n=a.length;
        int m=a[0].length;
        int ci=0;
        int cj=0;
        int [][] b = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]==0){
                   ci=i;
                   cj=j;
                   break;
                }
                for(int k=0; k<m; k++){
                   if(k==ci || k==cj){
                       b[i][k]=0;
                   }
                   else{
                       b[i][k]=1;
                   }
                }
                System.out.println(b);
            }

        }
    }
}
