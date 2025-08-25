package BankApp;

public class BankAccount {
    private static int nextAccountNumber = 1000; //starting point of the account number generator.
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = nextAccountNumber++;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    //if user wants to see their balance:
    public double showBalance(){
        return this.balance;
    }

    //Deposit method
    public void deposit(double amount){
        if (amount < 0){ //if the amount is negative
            System.out.println("INVALID AMOUNT");
        }
        else {
            this.balance += amount;
            System.out.println("DEPOSIT SUCCESS");
            System.out.printf("DEPOSIT AMOUNT: $%.2f\n", amount);
            System.out.printf("AVAILABLE BALANCE: $%.2f\n", this.balance);
        }
    }
    //Withdrawal method
    public void withdraw(double amount){
        if (amount < 0){ //if the amount is negative 
            System.out.println("INVALID AMOUNT");
        }
        else if (amount > this.balance){ //if the desired withdrawal amount is larger than the current balance
            System.out.println("INSUFFICIENT BALANCE!");  
        }
        else {
            this.balance -= amount;
            System.out.println("WITHDRAWAL SUCCESS");
            System.out.printf("WITHDRAWAL AMOUNT: $%.2f\n", amount);
            System.out.printf("AVAILABLE BALANCE: $%.2f\n", this.balance);
        }
    }   
}
