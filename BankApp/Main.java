/* Day 5 (Simple OOP project) (08/24/25)
 * Simple Bank teller program that utilizes java's OOP features.
 * Kind of hard and made me use chatgpt more than anticipated although I learned a lot in OOP principles at the same time
 * Will update tomorrow with log in features utilizing arrays and arraylists.
 */

package BankApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        // Declare local variables
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();

        boolean isRunning = true;

        // Display Screen
        while (isRunning){

            // Menu Screen
            System.out.println("***************");
            System.out.println("  BANKING APP");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Widthraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your transaction (1-4): "); // Get and process user choice
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> System.out.printf("YOUR BALANCE: $%.2f\n", account.showBalance()); //show balance case
                case 2 -> { //deposit case
                    System.out.print("ENTER AMOUNT DEPOSITED: ");
                    double amount = input.nextDouble();
                    account.deposit(amount);
                }
                case 3 -> { //withdrawal case
                    System.out.print("ENTER WITHDRAWAL AMOUNT: ");
                    double amount = input.nextDouble();
                    account.withdraw(amount);
                }
                case 4 -> { //exit case
                    System.out.println("TRANSACTION EXITED");
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        input.close();
    } 
}