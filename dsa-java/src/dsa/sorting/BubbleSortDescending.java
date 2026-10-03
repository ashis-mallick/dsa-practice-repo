package dsa.sorting;

import java.util.Scanner;

public class BubbleSortDescending {
    public static void main(String[] args) {
        System.out.println("enter size of array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("enter values to array : ");
        for (int i = 0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" before sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println( "after sorting : ");

        for (int j : arr) {
            System.out.print(j + " ");
        }






    }


    public  static  void  bubbleSort(int arr[]){
        for (int i = 0 ;i < arr.length-1 ; i++){

            for (int j = 0 ; j<arr.length -i-1 ; j++){

                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }

}
