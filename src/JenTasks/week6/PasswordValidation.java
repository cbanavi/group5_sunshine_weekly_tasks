package JenTasks.week6;

public class PasswordValidation {
    public static boolean passwordValidation(String password) {
        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }
        // Initializing boolean flags for each requirement
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(each)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password="World1234%";
        System.out.println("passwordValidation(password) = " + passwordValidation(password));
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
