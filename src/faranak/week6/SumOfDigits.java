package faranak.week6;

public class SumOfDigits {

    public static void main(String[] args) {

        String str = "Far369";
        String output = sumOfDigits(str);
        System.out.println(output);
    }

    public static String sumOfDigits(String str) {
        //will store the sum of the digits in the string
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
               //checks if the char is a digit
            if (Character.isDigit(str.charAt(i))) {
                //if the char is a digit, convert it to an int and add it to the sum
                sum = sum + Integer.parseInt(str.substring(i, i + 1));
            }
            else {
                //if the char is not a digit, continue to the next char
                continue;
            }
        }
        //converts the sum to a string and returns it
        return Integer.toString(sum);
    }
}

//Write a method that can return the sum of the digits in a string
