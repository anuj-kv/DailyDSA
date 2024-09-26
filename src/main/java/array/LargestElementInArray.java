package array;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        //Find the largest element in the given array
        int[] arr = {51,4,213,2,55,2,4,235,214,236};
        //Brute force will be sorting and then returning the last element
        Arrays.sort(arr);
        System.out.println("largest element : "+arr[arr.length-1]);

        // Optimal solution
        int[] arr1 = {51,4,213,2,55,2,4,235,214,236};;
        int largest = arr1[0];
        for(int i=1; i<arr1.length; i++){
            if(arr1[i]>largest) {
                largest = arr1[i];
            }
        }
        System.out.println("largest element : "+largest);
    }
}
