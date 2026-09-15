package dsa.recursion;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int reverse = reverse(1234,0);
        System.out.println(reverse);
    }


    public static  int reverse(int n,int rev){
        if(n==0) return rev;

        int rem =n%10;
        rev = rev*10+rem;

        return reverse(n/10,rev);



    }
}
