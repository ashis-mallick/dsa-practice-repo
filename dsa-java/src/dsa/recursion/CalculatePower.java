package dsa.recursion;

public class CalculatePower {
    public static void main(String[] args) {
        int calculated = calculatePower(5, 3);
        System.out.println(calculated);
    }

    private static int calculatePower(int m, int n) {
        if(m==0) {
            System.out.println("Base can't be 0");
            return -1;
        }
        if(n==0) return 1;
        return  m * calculatePower(m,--n);
    }


}
