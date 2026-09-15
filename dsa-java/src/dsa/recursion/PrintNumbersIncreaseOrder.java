package dsa.recursion;

public class PrintNumbersIncreaseOrder {
    public static void main(String[] args) {
        printIncrease(10);


    }

    public static void printIncrease(int number){
        if(number == 0 ) return;

        printIncrease(number-1);
        System.out.print(number +" ");
    }
}
