package Array;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class ArrayMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much size array create : ");
        int size = sc.nextInt();

        // create number array
        int []number = new int[size];

        // enter element array
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter element array : ");
            number[i] = sc.nextInt();
        }

        // miminum element array
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min)
            {
                min = number[i];
            }
        }
        System.out.println("Minimum element is : " + min);
    }
}
