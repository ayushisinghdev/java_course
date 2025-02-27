package chapter8;

import java.util.Scanner;

/**
 * Pwd must b 8 char long
 * 1 uupercase
 * 1 special char
 * not username
 * not same old pwd
 */

public class PasswordValidator {

    private static String username;
    private static String password;
    private static String newPassword;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        getUsername();
        getPassword();
        getNewPassword();
        lengthCheck(newPassword);
        caseCheck(newPassword);
        specialCharCheck(newPassword);
        printPasswordValidationResult(newPassword);

    }

    public static String getUsername(){
        System.out.println("Enter your username");
        username = scanner.next();
        return username;
    }

    public static String getPassword(){
        System.out.println("Enter your existing password");
        password = scanner.next();
        return password;
    }

    public static String getNewPassword(){
        System.out.println("Enter your new password");
        newPassword = scanner.next();
        return newPassword;
    }

    public static boolean lengthCheck(String newPassword){
        int length = newPassword.length();
        if(length<8)
            return false;
        else
            return true;
    }

    public static boolean caseCheck(String newPassword){
        StringBuilder modifierText = new StringBuilder(newPassword);
        for(int i = 0; i<modifierText.length(); i++){
            if(Character.isUpperCase(modifierText.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean specialCharCheck(String newPassword){
        StringBuilder modifierText = new StringBuilder(newPassword);
        for(int i = 0; i<modifierText.length(); i++){
            if(Character.isLetterOrDigit(modifierText.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void printPasswordValidationResult(String newPassword){
        if(username.equals(newPassword) && password.equals(newPassword) && lengthCheck(newPassword) == true && caseCheck(newPassword) == true && specialCharCheck(newPassword) == true){
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password invalid");
        }

    }
}
