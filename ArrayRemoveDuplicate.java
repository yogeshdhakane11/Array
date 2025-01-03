package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size : ");
        int size = sc.nextInt();

        // create array
        int [] array = new int[size];

        // add element array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array : ");
            array[i] = sc.nextInt();
        }
        // print array
        System.out.println("Array is : ");
        for (int num : array){
            System.out.print(num+" ");
        }

        // duplicate remove
        Set<Integer> set = new HashSet<>();

        // set add ele set duplicate not allowed
        for (int num : array){
            set.add(num);
        }
        // unique element array
        int [] uniqueArr = new int[set.size()];
        int index = 0;
        //
        for (int num: set){
            uniqueArr[index++] = num;
        }
        //
        System.out.println(Arrays.toString(uniqueArr));
    }
}
