package faranak.week6;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "369@";
        boolean result = passwordValidation(password);
        System.out.println(result);
    }
    public static boolean passwordValidation(String password) {
        boolean result = false;
        if (password.length() >= 6 && !password.contains(" ")
                && password.matches(".*[A-Z].*")//.* means any character(including none)
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*].*")) {
            result = true;
        }
        return result;

    }


}
// Write a return method that can verify if a password is valid or not. requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false
