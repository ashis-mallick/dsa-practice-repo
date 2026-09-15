package dsa.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(findBinary(13,0));
        System.out.println(getBinary(13));

    }

    private static int findBinary(int decimal,int c) {
        if(decimal==0) return 0;
        return (int) (decimal%2 *Math.pow(10,c)+findBinary(decimal/2,c+1));
    }

    private static int getBinary(int decimal) {
        if(decimal==0) return 0;
        return decimal%2 + 10 * getBinary(decimal/2);
    }
}
