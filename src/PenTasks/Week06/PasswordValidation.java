package PenTasks.Week06;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(validPassword("369@Lo"));
        System.out.println(validPassword("33cc"));
    }

    public static boolean validPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
//create an array out of string and go through each character
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)){ hasUpper = true;}
            else if (Character.isLowerCase(ch)) {hasLower = true;}
            else if (Character.isDigit(ch)) { hasDigit = true;}
            else { hasSpecial = true;}
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}




/*
String -- Password Validation Task
Write a return method that can verify if a password is valid or not.
Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

If all requirements above are met, the method returns true, otherwise returns false
 */
