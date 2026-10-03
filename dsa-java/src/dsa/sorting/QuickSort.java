package dsa.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 4, 2};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);


    }

    public static void quickSort(int[] arr, int low, int high) {
        int pi = partition(arr, low, high);

        if (low < pi-1) {
            quickSort(arr, low, pi - 1);
        }
        if (pi < high) {
            quickSort(arr, pi, high);
        }


    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[(low + high) / 2];


        while (low <= high) {

            while (arr[low] < pivot) {
                low++;

            }
            while (arr[high] > pivot) {
                high--;

            }

            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }

        }

        return low;


    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
