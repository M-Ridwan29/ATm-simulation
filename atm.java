import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;   // Initial balance
        int pin = 1234;       // Default PIN
        int enteredPin;
        int choice;
        int amount;

        System.out.print("Enter your PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            do {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        amount = sc.nextInt();
                        balance += amount;
                        System.out.println("Deposited successfully!");
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        amount = sc.nextInt();
                        if (amount <= balance) {
                            balance -= amount;
                            System.out.println("Withdrawn successfully!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } while (choice != 4);
        } else {
            System.out.println("Incorrect PIN! Access denied.");
        }

        sc.close();
    }
}
