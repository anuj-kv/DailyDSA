package array;

import java.util.Arrays;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,2,4,52,3424,3,4,32,34,5,4,2,2};
        System.out.println(secondSmallestElementBrute(arr));
        System.out.println(secondSmalllestElementBetter(arr));
    }

    public static int secondSmallestElementBrute(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]) return arr[i+1];
        }
        return -1;
    }

    public static int secondSmalllestElementBetter(int[] arr){
        int smallest = arr[0];
        int ssmallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        for(int i=0; i<arr.length; i++){
            if(){

            }else if
            (arr[i]<ssmallest && arr[i]!=smallest){
                ssmallest = arr[i];
            }else
        }
        return  ssmallest;
    }
}
