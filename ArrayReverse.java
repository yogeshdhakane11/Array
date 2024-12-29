package Array;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        // create array
        int [] array = new int[size];

        // add element array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array : ");
            array[i] = sc.nextInt();
        }

        // print original array
        System.out.println("Original array is : ");
        for (int original : array){
            System.out.println(original);
        }

        // reverse array logic
        int start = 0;
        int end = array.length-1;

        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        // reverse array print
        System.out.println("Reverse array : ");
        for (int rev : array){
            System.out.println(rev);
        }
    }
}