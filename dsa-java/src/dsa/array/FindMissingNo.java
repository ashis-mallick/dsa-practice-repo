package dsa.array;

public class FindMissingNo {
    public static void main(String[] args) {
        int [] arr = { 1 , 5 , 3 , 4 };
        int n =5;
        int missingNo = findMissingNo(arr, n);
        System.out.println(missingNo);

    }

    public static int findMissingNo(int [] arr, int n){

        int xorSum=0;
        for (int i : arr){
            xorSum ^=i;

        }
        System.out.println(xorSum);
        int xorSum2=0;
        for( int i =1;i<=n;i++){
            xorSum2 ^=i;
        }
        System.out.println(xorSum2);

        return xorSum ^ xorSum2;

    }

}
