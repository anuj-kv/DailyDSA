package Step1.ThingsToKnowInJava;

import java.util.Scanner;

public class UserInputOutput {
    public static void main (String args[]){
        //For Output
        System.out.println("This is great that you learn how to do output in java ....");

        //For Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string input...");
        String str = sc.nextLine();
        System.out.println("Provide a number ..");
        int number = sc.nextInt();
        sc.nextLine();  // Giving a nextLine() here because after entering the number when we hit the
        System.out.println("Provide another string ..");        String str1 = sc.nextLine();
        System.out.println("The string that you input is --- > "+str);
        System.out.println("The number that you input is --- > "+number);
        System.out.println("The string 2 that you input is --- > "+str1);
    }
}
