package faranak.week5;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";
        String output = reverse(str);
        System.out.println(output);
    }
    public static String reverse(String str) {
        String output = "";      //will store the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            //appends each char from the input  to the output
            output = output + str.substring(i, i + 1);
        }
        return output;
    }
}
//Write a return method that can reverse String
// Ex: Reverse("ABCD"); ==> DCBA