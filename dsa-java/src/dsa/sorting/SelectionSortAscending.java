package dsa.sorting;

public class SelectionSortAscending {
    public static void main(String[] args) {
        int [] arr = {12,69 ,6 ,36 ,65 ,45 ,97 ,52 ,34};
        selectionSort(arr);

        for ( int i : arr){
            System.out.print(i + " ");
        }

    }

    public  static  void  selectionSort(int arr []){

        for ( int i = 0 ; i < arr.length-1 ; i++){
            int min = i;

            for ( int j = i+1 ; j< arr.length-1 ; j++){

                if (arr[j]<arr[min]){

                    min = j;

                }
            }

            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }



    }
}
