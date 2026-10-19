package dsa.array;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3};
        int[] arr8 = {-5, -5, -3, -1, -1, 0, 2, 2};
        int i = removeDuplicate(arr8);
        System.out.println(i);

    }

    public static  int removeDuplicate(int [] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;

        while(j < n){
            if (arr[j] == arr[i]){
                j++;
            }else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return  i+1;
    }
}
