package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        // array create
        int [] array = new int[size];

        // add element array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array : ");
            array[i] = sc.nextInt();
        }
        // print array
        System.out.println("Array : ");
        for (int num : array){
            System.out.println(num);
        }

        // element frequency count hashmap use
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        // check key value
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i]))
            {
                hashMap.put(array[i], hashMap.get(array[i])+1);
            }
            else {
                hashMap.put(array[i],1);
            }
        }

        // print frequency
        for(Map.Entry entry:hashMap.entrySet())
        {
            System.out.println("Element  | Frequency");
            System.out.println(entry.getKey()+"           "+entry.getValue());
        }
    }
}
