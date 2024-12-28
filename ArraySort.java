package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create array
        int []arr = new int[7];

        // array imput
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element array : ");
            arr[i] = sc.nextInt();
        }

        // sort array
        Arrays.sort(arr);

        // sorted array
        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
