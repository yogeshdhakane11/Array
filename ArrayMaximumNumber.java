package Array;

import java.util.Scanner;

public class ArrayMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        // create array
        int []number = new int[size];

        // add element array
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter element array : ");
            number[i] = sc.nextInt();
        }

        // max element find
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]){
                max = number[i];
            }
        }
        System.out.println("Maximum element array : " + max);
    }
}
