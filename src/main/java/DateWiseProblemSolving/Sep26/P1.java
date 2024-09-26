package DateWiseProblemSolving.Sep26;

public class P1 {
    public static void main(String args[]){
        //Reverse the array
        int input[] = {1,4,3,2,6,5};
        // output: {5,6,2,3,4,1};
        //First Method With Extra space having new array and Time Complexity is O(N)
        int[] out = new int[input.length];
        //for(int i=input.length-1; i>=0; i--){
        int n = input.length;
        for(int i=0; i<n; i++){
            out[i] = input[n-1-i];
        }
        for(int e : out){
            System.out.print (e +", ");
        }
        System.out.println();
        // Without Using any extra space and Time Complexity is O(log(N))
        int start = 0;
        int end = input.length-1;
        while(start<end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        for(int e : input){
            System.out.print(e+", ");
        }
    }
}
