package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArrayCommanElement{
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,6,7};
        int [] array2 = {1,4,7,8,9,0};

        System.out.println("array 1 : " + Arrays.toString(array1));
        System.out.println("array 2 : " + Arrays.toString(array2));

        // set create store the common elements
        Set<Integer> CommonEleSet = new HashSet<>();

        // convert first array set
        Set<Integer> set1 = new HashSet<>();
        //
        for (int arr1 : array1){
            set1.add(arr1);
        }
        // loop through second array common element
        for (int arr2 : array2){
            // check set1 set2 elements
            if (set1.contains(arr2)){
                CommonEleSet.add(arr2);
            }
        }
        System.out.println("Common elements : " + CommonEleSet);
    }
}
