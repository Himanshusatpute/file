package himanshu;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    user.register();
                    break;
                case 2:
                    boolean loginSuccessful = user.login();
                    if (loginSuccessful) {
                        Account account = new Account(scanner);
                        AccountManager accountManager = new AccountManager(scanner);
                        // You can add additional functionality here for account management
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }
}
