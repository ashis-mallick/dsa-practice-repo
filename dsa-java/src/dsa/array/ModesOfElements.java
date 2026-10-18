package dsa.array;

import java.util.HashMap;

public class ModesOfElements {
    public static void main(String[] args) {
        int [] arr = {14,25,65,32,45,85,99,99,99,85,14,25,45};
        int modeOfElement = modeOfElement(arr);
        System.out.println(modeOfElement);


    }

    public static int modeOfElement(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for (int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));

        }

        int mode =-1;
        int key =-1;
        for(int i : freq.keySet()){
            if(freq.get(i)>mode){
                mode = freq.get(i);
                key = i;

            }
        }
        return key;

    }


}
