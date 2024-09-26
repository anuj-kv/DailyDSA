package Step1.ThingsToKnowInJava;

public class IfElseStatement {
    public static void main(String[] args) {
        if(1==1){
            System.out.println("1 is always equals to 1 therefor if statement got executed ....");
        }else{
            System.out.println("if if-block condition is false we go into the else block");
        }

        if(1==2){
            System.out.println("1 is not equals to 2 therefore if block will not get executed ....");
        }else{
            System.out.println("The condition in the if-block is false therefore else block get executed..");
        }

        int age =13;
        if(age<18){
            System.out.println("teenager");
        } else if (age<40) {
            System.out.println("Young man ");
        } else if (age<55) {
            System.out.println("Middle age man ");
        } else {
            System.out.println("old man");
        }
    }
}
