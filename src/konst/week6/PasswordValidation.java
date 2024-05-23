package konst.week6;

/*
String -- Password Validation Task
Write a return method that can verify if a password is valid or not.
Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

If all requirements above are met, the method returns true, otherwise returns false
*/

public class PasswordValidation {
    public static boolean isValidPassword(String password) {
        // Check size and spaces
        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Iterate through each character of the password and check all requirements
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
    public static void main(String[] args) {
        System.out.println(isValidPassword("P@ssw0rd"));
        System.out.println(isValidPassword("password"));
        System.out.println(isValidPassword("P@ssw ord"));
        System.out.println(isValidPassword("P@sswo4d"));
    }
}


