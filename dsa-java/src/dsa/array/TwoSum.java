package dsa.array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int [] arr = {1,5,6,9,8,2,7};
        int target =15;

        int[] bruteForceResult = twoSum(arr, target);

        int[] hashMapResult = twoSumUsingHashMap(arr, target);


        for(int i : hashMapResult){
            System.out.print(i+" ");
        }

    }

    public static int [] twoSum(int [] arr , int target){
        int n = arr.length;
        for ( int i = 0 ; i < n-1 ; i++){
            for( int j =i+1; j<n;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return  new int[]{};

    }

    public static int [] twoSumUsingHashMap(int []arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length;i++){
            int wanted = target -arr[i];

            if(map.containsKey(wanted)){
                return  new int[] {i,map.get(wanted)};
            }else {
                map.put(arr[i],i);
            }


        }

        return new int[] {};
    }
}
