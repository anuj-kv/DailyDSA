package DateWiseProblemSolving.Sep26;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        //Find the maximum and minimum of ana array using minimum number of comparisons
        int[] input = {3,5,4,1,9};
        //Sorting and returning the first and last element as min and max
        Arrays.sort(input);
        System.out.println("min : "+input[0]);
        System.out.println("max : "+input[input.length-1]);

        //Iterating the complete array and updating min and max
        int min = input[0];
        int max = input[0];
        for(int i=0; i<input.length; i++){
            if(input[i]<min){
                min = input[i];
            }
            if(input[i]>max){
                max = input[i];
            }
        }
        System.out.println("min : "+min);
        System.out.println("max : "+max);

    }
}
