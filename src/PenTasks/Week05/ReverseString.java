package PenTasks.Week05;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString1("ABCD"));
        System.out.println(reverseString2("ABCD"));
    }

public static String reverseString1(String str) {
    //create a StringBuilder
    StringBuilder bstr = new StringBuilder(str);
    //reverse the string
    bstr.reverse();
    //return the reversed string
    return bstr.toString();
}

public static String reverseString2(String str) {
    // Check if str is null or empty
    if (str == null || str.isEmpty()) {
        return "Please enter a valid string";
    }else{

//Create a StringBuilder
StringBuilder reversedStr = new StringBuilder();

    // Loop through the string in reverse order and append each character to the StringBuilder
    for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr.append(str.charAt(i));
    }

    // Return the reversed string
    return reversedStr.toString();
}
    }

}




/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
