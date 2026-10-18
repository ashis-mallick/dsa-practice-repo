package dsa.array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        reverseArray(arr);
        printArray(arr);

    }

    public static void reverseArray(int [] arr) {
        int i = 0;
        int j = arr.length-1;

        while (i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public  static  void  printArray(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

}
