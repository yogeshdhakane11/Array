package Array;


import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        // create array
        int [] numbers = new int[size];

        // add element array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element array : ");
            numbers[i] = sc.nextInt();
        }

        // sum of array element
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array is : "+ sum);
    }
}
