package faranak;

public class DivisionWithoutOperator_faranak {

    public static void main(String[] args) {

        int result = dividingWithOutOperator(100, -5);
        System.out.println(result);
    }
    public static int dividingWithOutOperator(int n1, int n2){
        if (n1 == 0 || n2 == 0){
            throw new ArithmeticException("Number can not be divided by zero");
        }
        if (n1 < 0 || n2 < 0){
            throw new ArithmeticException("Number can not be negative");

        }
        int quotient = 0;

        while (n1 >= n2){
            n1 = n1 - n2;
            quotient++;

        }
        return quotient;

    }
}
// Create a method that divide two numbers without operator