package himanshu;

import java.io.InputStream;
import java.util.Scanner;

public class User {
    private String email;
    private String password;
    private Scanner scanner;

    public User(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public void register() {
        System.out.println("Full name:");
        String fullName = scanner.nextLine();
        System.out.println("Email:");
        this.email = scanner.nextLine();
        System.out.println("Password:");
        this.password = scanner.nextLine();
        System.out.println("Registration successful!");
    }

    public boolean login() {
        System.out.println("Email:");
        String enteredEmail = scanner.nextLine();
        System.out.println("Password:");
        String enteredPassword = scanner.nextLine();

        if (enteredEmail.equals(this.email) && enteredPassword.equals(this.password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }
}

