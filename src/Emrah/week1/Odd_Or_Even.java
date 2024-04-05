package Emrah.week1;

public class Odd_Or_Even {
    public static void main(String[] args) {
        int n = 2;
        // The modulo operator returns the remainder of the division of its first operand by its second operand.
        // In this case, n is divided by 2 and the remainder is 0, so the condition is always true.
        if (n % 2 == 0) {
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
// changes made