package dsa.recursion;

public class PrintOddNo {
    public static void main(String[] args) {
        printOdd(10);
    }

    private static void printOdd(int n) {
        if(n<=0) return;

        if(n%2!=0){
            System.out.println(n+" ");
            printOdd(n-2);
        }else printOdd(n-1);
    }
}
