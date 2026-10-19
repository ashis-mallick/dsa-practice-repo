package dsa.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        int[] arr1 = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> lists = threeSum(arr1, 0);

        for (List<Integer> li : lists){

            System.out.print(li);
        }

    }

    public static List<List<Integer>> threeSum(int [] arr , int target){

        Set<List<Integer>> set = new HashSet<>();

        int n = arr.length;

        for(int i = 0 ; i < n-2 ; i++){
            for( int j =i+1 ; j < n-1 ; j++){
                for (int k = j+1 ; k< n ; k ++){
                    if ( arr[i]+ arr[j] + arr[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);

                        Collections.sort(list);

                        set.add(list);


                    }
                }
            }
        }

        return new ArrayList<>(set);

    }
}
