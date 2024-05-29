package chiyavan.week5;

public class ReverseString_Chiyavan {

    public static void main(String[] args) {
        Reverse("ABCD");
    }

    public static void Reverse(String originalString) {

        StringBuilder stringBuilder = new StringBuilder(originalString);

        System.out.println(stringBuilder.reverse());


    }

}

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
