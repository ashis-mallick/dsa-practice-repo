package dsa.sorting;

public class InsertionSortAscending {
    public static void main(String[] args) {

        int[] arr = {12, 36, 85, 45, 69, 11};
        insertionSortAscending(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void insertionSortAscending(int arr[]) {

        int i, j, temp, n = arr.length;


        for (i = 1; i < n; i++) {


            temp = i;
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;

        }

    }


}
