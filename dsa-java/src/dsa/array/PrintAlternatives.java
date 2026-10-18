package dsa.array;

public class PrintAlternatives {
    public static void main(String[] args) {
        int [] arr = {14,25,65,32,45,85,99};
        printAlternatives(arr);


    }

    public static void  printAlternatives(int [] arr){
        int i =0;
        int j = arr.length-1;

        while (i<=j){
            if(i==j){
                System.out.print(arr[i]+" ");
                return;
            } else {
                System.out.print(arr[i]+" ");
                i++;
                System.out.print(arr[j]+" ");
               j--;
            }
        }

    }


}
