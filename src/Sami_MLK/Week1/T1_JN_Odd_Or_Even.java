package Sami_MLK.Week1;

public class T1_JN_Odd_Or_Even {
    public static void main(String[] args) {
        oddOrEven(9);
    }

    private static void oddOrEven(int n) {
        if(n%2==0){
            System.out.println("The "+n+" is an even number");
        }else {
            System.out.println("The "+n+" is an odd number");
        }
    }
}
/*
1. Numbers -- odd & even
Write a method which can identify given number is even or odd
Ex: identify(5) -> "Odd"
    identify(6) -> "Even"
 */

