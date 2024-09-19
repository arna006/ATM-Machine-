import java.util.Scanner;

public class AtmMachine {

    public static void main(String[] Args) {

        int bankPin = 3325;
        double userBalance = 25000;

        System.out.println("Hello! Welcome to this ATM Machine");

        Scanner console = new Scanner(System.in);

        // PIN sjekk
        while (true) {
            System.out.print("Enter pin: ");
            int correctPin = console.nextInt();

            if (correctPin == bankPin) {
                System.out.println("Correct pin!");
                break;
            } else {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }

        // Meny
        while (true) {
            System.out.println("\nChoose one of the options below: ");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter the number of the option you wish: ");

            int userOptionChoice = console.nextInt();

            switch (userOptionChoice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = console.nextDouble();

                    if (amount <= userBalance) {
                        userBalance -= amount;
                        System.out.printf("You have withdrawn %.2f. Remaining balance: %.2f.\n", amount, userBalance);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 2:
                    System.out.printf("Your current balance is: %.2f.\n", userBalance);
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = console.nextDouble();
                    userBalance += depositAmount;
                    System.out.printf("Your new balance is: %.2f\n", userBalance);
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!! ");
                    console.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
