package PenTasks.Week06;

public class SumOfDigitsInString {

  public static void main(String[] args) {
      System.out.println(sumOfDigitsInString("123"));
      System.out.println(sumOfDigitsInString("123abc"));
      System.out.println(sumOfDigitsInString("abc123"));

  }


  public static int sumOfDigitsInString(String str) {
      if (str == null || str.toCharArray().length == 0) {
          throw new IllegalArgumentException("No input!");
      }
      char[] arr = str.toCharArray();
      int sum = 0;
      for (char ch : arr) {
          //make sure that ch is a digit -- we could use isDigit method as well
          if (ch >= '0' && ch <= '9') {
              //subtract '0' from ch to get the numeric value of the digit
              // (in the ASCII and Unicode character sets)
              sum += ch - '0';
          }
      }
      return sum;
  }

}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
