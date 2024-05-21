package chiyavan.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class PasswordValidation_Chiyavan {

    public static void main(String[] args) {
        passwordChecker("Abc1233456!");
        
    }

    public static void passwordChecker(String originalPassword) {

        boolean atLeast6Char = originalPassword.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        if (originalPassword.contains(" ")) {
            System.out.println(false);
            return;
        }

        for (char each : originalPassword.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        boolean isStrong = atLeast6Char && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if (isStrong) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }



    } 
    
}

/*
String -- Password Validation Task
Write a return method that can verify if a password is valid or not.
Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter GOT
3. PassWord should at least contain one lowercase letter GOT
4. Password should at least contain one special characters
5. Password should at least contain a digit GOT

If all requirements above are met, the method returns true, otherwise returns false
 */
