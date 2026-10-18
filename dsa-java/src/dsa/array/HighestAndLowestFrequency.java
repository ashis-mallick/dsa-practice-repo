package dsa.array;

import java.util.HashMap;

public class HighestAndLowestFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,4,4};
        int[] ints = highAndLowFrequency(arr);

        System.out.println("the no with highest frequency is "+ ints[0]);
        System.out.println("the no with lowest frequency is "+ ints[1]);


    }
    public static int []  highAndLowFrequency(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for (int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));

        }

        int highestFreq = Integer.MIN_VALUE;
        int highestFreqKey = -1;
        for (int key : freq.keySet()){
            if(freq.get(key) > highestFreq){
                highestFreq = freq.get(key);
                highestFreqKey = key;
            }

        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestFreqKey = -1;
        for (int key : freq.keySet()){
            if(freq.get(key) < lowestFreq){
                lowestFreq = freq.get(key);
                lowestFreqKey = key;
            }

        }

        return new int[]{highestFreqKey, lowestFreqKey};
    }
}
