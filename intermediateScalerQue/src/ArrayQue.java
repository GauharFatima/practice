public class ArrayQue {
    public static void main(String[] args) {
        //counting the freq and print it in new array
        int arr[]= new int[]{2,2,2,1,1,4,};
        int newArr[]=new int [arr.length];

        for(int i=0; i<arr.length; i++){
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                    count++;
            }
            newArr[i]=count;
            System.out.print( newArr[i] + " ");
        }
    }
}