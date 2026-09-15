package dsa.recursion;

public class PrintEven {
    public static void main(String[] args) {
        printEven(7);

    }

    public static void printEven(int n){
        if (n==2){
            System.out.println(n +" ");
            return;
        }
        if(n%2==0){
            printEven(n-2);
            System.out.println(n+" ");

        }else printEven(n-1);

    }
}
