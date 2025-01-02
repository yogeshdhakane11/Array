package Array;

import java.util.Scanner;

public class MoveAllZeroEnd {
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

        // print array
        System.out.println("Array elements :");
        for(int num : array){
            System.out.print(num + " ");
        }
        // call function
        moveZerosEnd(array);
        // print result array
        System.out.println("\nMove all zero end : ");
        for (int result : array){
            System.out.print(result + " ");
        }
    }
    // move all zero end
    public static void moveZerosEnd(int []array) {
        int nonZeroIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                if (i!= nonZeroIndex){
                    array[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}
