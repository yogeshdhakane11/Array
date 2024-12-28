package Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number How many Size of Array Create : ");

        // create array
        int size = sc.nextInt();
        int []numberArray = new int[size];

        // enter element array input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element array : ");
            numberArray[i] = sc.nextInt();
        }

        // print array element
        System.out.println("Array Elements : ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }
}
