package Array;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        // create array
        int [] originalArray = new int[size];
        int [] copiedArray = new int[originalArray.length];

        // add element original array
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Enter element array : ");
            originalArray[i] = sc.nextInt();
        }

        // print original array
        System.out.println("Original array is : ");
        for(int num : originalArray){
            System.out.println(num);
        }

        // Copy the array using System.arraycopy
        System.arraycopy(originalArray,0, copiedArray,0, originalArray.length);

        // copy array print
        System.out.println("Copied Array is : ");
        for (int num : copiedArray){
            System.out.println(num);
        }
    }
}
