package PenTasks.Week03;

public class ArmstrongNumberGen {

        public static void main(String[] args) {

            armstrongChecker(5778);

        }

        public static boolean armstrongChecker(int num) {

int power =  String.valueOf(num).length();


            int originalNum, remainder, result = 0;

            originalNum = num;


            while (originalNum != 0) {
                remainder = originalNum % 10;
                result += (int) Math.pow(remainder, power);
                originalNum /= 10;
            }

            if (result == num) {
                System.out.println(num + " is an Armstrong number.");
                return true;
            } else {
                System.out.println(num + " is not an Armstrong number.");
                return false;
            }
        }
    }
/*
Write a method that can check if a number is
Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
 */

