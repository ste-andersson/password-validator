package passwordvalidator;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Select a username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Select a password:");
        String password = scanner.next();
    }
}
