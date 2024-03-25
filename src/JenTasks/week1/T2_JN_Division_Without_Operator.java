package JenTasks.week1;

public class T2_JN_Division_Without_Operator {
    public static void main(String[] args) {
        specialDivision(2000, 10);
    }

    private static void specialDivision(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Not divisible by zero");
        }
        double reciprocal = 1 / y;
        double result = reciprocal * x;
        System.out.println(x + " divided by " + y + " without using division operator is " + result);
        System.out.println("This result is based on Reciprocal Multiplication Method, where the division is performed by multiplying by the reciprocal of the divisor. ");
    }

}
/*

2. Numbers -- Divide without '/' operator
Write a method that can divide two numbers without using division '/' operator

 */