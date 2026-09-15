package dsa.recursion;

public class PrintNumbersInDecreaseOrder {
    public static void main(String[] args) {
        printDecrease(10);

    }

    public static void printDecrease(int number){
        if(number == 0 ){
            System.out.print(number);
            return;
        }
        System.out.print(number +" ");
        printDecrease(number-1);
    }
}
