package dsa.recursion;

public class IsPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1331));

    }

    private static boolean isPalindrome(int number){

        return number==isReverse(number,0);


    }


    private static int isReverse(int number , int reverse){
        if(number==0) return reverse;
        int  rem = number % 10;

        reverse = (reverse * 10) + rem;

        return isReverse(number/10,reverse);


    }
}
