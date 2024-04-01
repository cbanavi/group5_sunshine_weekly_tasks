package faranak;

import java.util.Scanner;

public class DivisionWithoutOperator_faranak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println(a + " / " + b + " = " + division(a, b));
        input.close();
    }

    public static int division(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        if(b < 0) {
            return -division(a, -b);
        }

        int result = 0;

        while (a >= b) {
            a = a - b;
            result = result + 1;


        }
        return result;



    }



    }






// Create a method that divide two numbers without operator