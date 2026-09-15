package dsa.recursion;

public class FindGCD {
    public static void main(String[] args) {
        System.out.println(findGCD(40,30));
        System.out.println(getGCD(40,30));
    }

    private static int findGCD(int num1, int num2) {
        while(num1!=num2){
            if(num1>num2) return  findGCD(num1-num2,num2);
            else return findGCD(num1,num2-num1);
        }
        return num1;

    }

    private static int getGCD(int n,int m){
        if(m==0) return  n;
        return getGCD(m,n%m);

    }
}
