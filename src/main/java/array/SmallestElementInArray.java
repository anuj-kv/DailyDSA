package array;

import java.util.Arrays;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,24,24,24,2,2342,34};
        System.out.println(smallestElementBrute(arr));
        System.out.println(smallestElementOptimal(arr));

    }

    public static int smallestElementBrute(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int smallestElementOptimal(int[] arr){
        int smallestElement = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallestElement){
                smallestElement = arr[i];
            }
        }
        return smallestElement;
    }

}
