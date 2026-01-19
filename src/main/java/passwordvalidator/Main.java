package passwordvalidator;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String oldPassword = "superStar*#1";
        System.out.println("Select a username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Select a password:");
        String password = scanner.next();

        do {
            while (!PasswordValidation.isLongEnough(password)) {
                System.out.println("Password needs to be at least 8 characters. Try again!");
                password = scanner.next();
            }
            while (!PasswordValidation.hasUpperCase(password)) {
                System.out.println("Password needs to have at least one upper case character. Try again!");
                password = scanner.next();
            }
            while (!PasswordValidation.hasSpecialCharacter(password)) {
                System.out.println("Password needs to have at least one special character. Try again!");
                password = scanner.next();
            }
            while (!PasswordValidation.doesNotContainUsername(password, username)) {
                System.out.println("Password must not contain your username. Try again!");
                password = scanner.next();
            }
            while (!PasswordValidation.isNotOldPassword(password, oldPassword)) {
                System.out.println("Password must not be same as old password. Try again!");
                password = scanner.next();
            }
        } while (!PasswordValidation.isLongEnough(password) || !PasswordValidation.hasUpperCase(password) ||
                !PasswordValidation.hasSpecialCharacter(password) || !PasswordValidation.doesNotContainUsername(password, username) ||
                !PasswordValidation.isNotOldPassword(password, oldPassword));
        String confirmedPassword = password;
        System.out.println(String.format("Password has been set to %s!", confirmedPassword));

    }
}
