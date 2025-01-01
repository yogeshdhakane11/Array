package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        // create array
        int [] array = new int[size];

        // add element array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array : ");
            array[i] = sc.nextInt();
        }

        // print array
        System.out.println("Array : ");
        for (int num : array){
            System.out.print(num + " ");
        }

        // array sort
        Arrays.sort(array);

        System.out.println();
        // check second largest element
        if (array.length < 2){
            System.out.println("Array doesn't have enough elements.");
        }
        else {
            // sorted array array [size - 2]
            System.out.println("Second Largest element is : " + array[size- 2]);
        }
    }
}
