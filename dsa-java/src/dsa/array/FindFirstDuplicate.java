package dsa.array;

import java.util.HashMap;

public class FindFirstDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 4};

        int firstDuplicate = removeFirstDuplicate(arr1);
        System.out.println(firstDuplicate);

    }

    public static int removeFirstDuplicate(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (int num : arr){
            if ( map.get(num)> 1){
                return num;
            }
        }

        return  -1;
    }

}
