package dsa.array;

// for a particular element sum of all left element is equals to sum of all right elements


public class FindPivot {
    public static void main(String[] args) {

        int[] arr1 = {1, 7, 3, 6, 5, 6};
        int pivot = findPivot(arr1);
        System.out.println(pivot);



    }


    public  static  int findPivot(int [] arr){
        int n  = arr.length;
        int [] leftSum = new  int[n];
        int [] rightSum = new  int[n];

        leftSum[0] = arr[0];
        for( int i = 1 ; i < n ; i++){
            leftSum[i] = leftSum[i-1]+arr[i];

        }

        rightSum[n-1] = arr[n-1];
        for( int i = n-2 ; i>=0 ; i--){
            rightSum[i] = arr[i]+rightSum[i+1];

        }

        for ( int i = 0 ; i< n ; i++){
            if (leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;


    }
}
