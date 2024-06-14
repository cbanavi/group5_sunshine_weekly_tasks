package JenTasks.week5;

public class ReverseString {
    //by utilizing StringBuilder
    public static String reverseStr(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    //by utilizing Recursive Approach
    public static String recursiveReverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return recursiveReverse(str.substring(1)) + str.charAt(0);
        // Recursive function reverses a string by appending the first character to the result of reversing the substring that excludes the first character until the base case of a string with length 0 or 1 is reached.
    }

    //by using StringBuilder reverse method
    public static String reverseMethod(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("reverseStr(str) = " + reverseStr(str));
        System.out.println("recursiveReverse(str) = " + recursiveReverse(str));
        System.out.println("reverseMethod(str) = " + reverseMethod(str));

    }
}


/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
