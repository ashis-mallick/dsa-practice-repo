package dsa.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(printSum(10));

    }

    private static int printSum(int n) {
        if (n==0) return 0;

        else return n+printSum(n-1);
    }
}
