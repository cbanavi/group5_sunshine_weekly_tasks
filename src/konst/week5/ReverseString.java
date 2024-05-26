package konst.week5;

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
*/

public class ReverseString {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        // Loop through the string backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }
}


