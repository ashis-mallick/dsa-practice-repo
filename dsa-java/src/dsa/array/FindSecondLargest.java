package dsa.array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] arr = {14,25,65,32,45,85,99,99,99,85};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }

    public static int secondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest){
                secondLargest=largest;
                largest = i;

            }else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }

        }
        return secondLargest;
    }
}
