package array;


import java.util.Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr01 ={1,4,3,2,312,4,52,41,423,43,4,224,23,23,423};
        int[] arr = {2,2,2,2,7,8};
        Arrays.sort(arr);
        int secondLargest = -1;
        for(int i=arr.length-1 ; i>0 ; i--){
            if(arr[i]!=arr[i-1]){
                secondLargest = arr[i-1];
                break;
            }
        }
        System.out.println(secondLargest);

        int largest = arr01[0];
        int second_largest = -1;
        for(int i=0; i<arr01.length; i++){
            if(arr01[i]>largest){
                second_largest = largest;
                largest = arr01[i];
            }
        }
        System.out.println(second_largest);

    }
}
