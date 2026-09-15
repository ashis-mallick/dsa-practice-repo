package dsa.recursion;

public class PrintFibonacciNo {
    public static void main(String[] args) {
        System.out.println(printFibonacci(5));
    }

    private static int printFibonacci(int n) {

        if(n ==0 || n ==1) return n;

        return printFibonacci(n -1)+printFibonacci(n -2);


    }
}
