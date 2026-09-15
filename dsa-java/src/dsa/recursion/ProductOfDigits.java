package dsa.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1234));
    }

    private static int productOfDigits(int number) {
        if (number == 0) return 1;
        return number % 10 * productOfDigits(number / 10);
    }
}
