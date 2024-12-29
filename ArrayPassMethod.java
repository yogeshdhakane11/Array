package Array;

import java.util.Scanner;

public class ArrayPassMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array : ");
        int size = sc.nextInt();

        // create array
        int [] array = new int[size];

        // add element array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array");
            array[i] = sc.nextInt();
        }

        // call printArray method
        printArray(array);

        // call sumArray method
        sumArray(array);
    }

    // print array pass method
    public static void printArray(int[] array)
    {
        System.out.println("Array elements are:");
        for (int num : array){
            System.out.println(num);
        }
    }

    // sum of array method
    public static void sumArray(int[] array)
    {
        int sum = 0;
        for (int num : array){
            sum = sum + num;
        }
        System.out.println("Sum of Array is : "+ sum);
    }
}
