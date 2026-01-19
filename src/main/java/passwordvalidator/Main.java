package passwordvalidator;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
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
        } while (!PasswordValidation.isLongEnough(password) || !PasswordValidation.hasUpperCase(password) ||
                !PasswordValidation.hasSpecialCharacter(password) || !PasswordValidation.doesNotContainUsername(password, username));
        System.out.println("Password has been set!");

    }
}
