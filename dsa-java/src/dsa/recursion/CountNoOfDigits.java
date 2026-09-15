package dsa.recursion;

public class CountNoOfDigits {
    public static void main(String[] args) {
        int countDigits = countDigits(12542);
        System.out.println(countDigits);
    }

    static  int count=0;
    private static int countDigits(int n) {
        if(n==0 ) return 0;

        count++;

        countDigits(n/10);

        return count;



    }
}
