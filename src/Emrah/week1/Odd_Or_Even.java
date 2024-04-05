package Emrah.week1;
@SuppressWarnings("ConstantConditions")
public class Odd_Or_Even {
    public static void main(String[] args) {
        int n = 4;
        // The modulo operator returns the remainder of the division of its first operand by its second operand.
        if(n % 2 == 0) {
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
// changes made1