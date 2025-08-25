/* Day 5  (Simple OOP project) (08/24/25)
 * Simple Bank teller program that utilizes java's OOP features.
 * Kind of hard and made me use chatgpt more than anticipated although I learned a lot in OOP principles at the same time
 * Will update tomorrow with log in features utilizing arrays and arraylists.
 */

package BankApp;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        // Declare local variables
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        boolean isRunning = true;

        //Starting menu (Asks user to either choose an existing account, register an account, and exit)
        while (isRunning){
            System.out.println("********************************************");
            System.out.println("BANK OF THE BOURGEOISIES OF CALIFORNIA (BBC)");
            System.out.println("********************************************");
            System.out.println("1. Register New Account");
            System.out.println("2. Choose Existing Account");
            System.out.println("3. exit");
            System.out.println("********************************************");
            System.out.print("Please Choose an action to proceed: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    //Reistration logic
                    System.out.print("ENTER NAME: ");
                    String name = input.nextLine();

                    int newAccountNumber = 1001 + accounts.size(); //avoids storing the account number as 1000, it should always start as 1001
                    BankAccount newAccount = new BankAccount(newAccountNumber, name, 0.0);

                    accounts.add(newAccount);

                    System.out.println("ACCOUNT REGISTERD SUCCESSFULLY");
                    System.out.println("YOUR REGISTERED ACCOUNT NUMBER: " + newAccountNumber);
                }
                case 2 -> {
                    // Show available accounts in the session
                    System.out.println("AVAILABLE ACCOUNTS: ");
                    for (BankAccount acc : accounts) {
                        System.out.println("Account number: " + acc.getAccountNumber() + "|| Owner: " + acc.getOwnerName());
                    }

                    //Choose what account shall be used
                    System.out.print("ENTER ACCOUNT NUMBER TO PROCEED: ");
                    int enteredAcc = input.nextInt();
                    input.nextLine();

                    BankAccount currentAcc = null;
                    
                    for (BankAccount acc : accounts){
                        if (acc.getAccountNumber() == enteredAcc) {
                            currentAcc = acc;
                            break;
                        };
                    }

                    if (currentAcc == null){
                        System.out.println("ACCOUNT NOT FOUND!");
                    }
                    else {
                        // Main transaction menu
                        boolean inAccount = true;
                        while (inAccount){       
                            // Menu Screen
                            System.out.println("***************");
                            System.out.println("1. Show Balance");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("4. Exit");
                            System.out.println("***************");

                            System.out.print("Enter your transaction (1-4): "); // Get and process user choice
                            int accountChoice = input.nextInt();

                            switch (accountChoice) {
                                case 1 -> System.out.printf("YOUR BALANCE: $%.2f\n", currentAcc.showBalance()); //show balance case
                                case 2 -> { //deposit case
                                    System.out.print("ENTER AMOUNT DEPOSITED: ");
                                    double amount = input.nextDouble();
                                    currentAcc.deposit(amount);
                                }
                                case 3 -> { //withdrawal case
                                    System.out.print("ENTER WITHDRAWAL AMOUNT: ");
                                    double amount = input.nextDouble();
                                    currentAcc.withdraw(amount);
                                }
                                case 4 -> { //exit case
                                    System.out.println("TRANSACTION EXITED");
                                    inAccount = false;
                                }
                                default -> System.out.println("INVALID CHOICE!");
                            }
                        }
                        currentAcc = null;
                    }
                }
                case 3 -> {
                    System.out.println("MENU EXITED, PROGRAM EXITED");
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE!");
            }

        }
        
        input.close();
    } 
}