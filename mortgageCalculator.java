/*
Day 4 of Creating mini projects every day. 
Mortgage Calculator 
*/

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Initialization of Variables
        double annualPay;
        double annualRate;
        double downpaymentPercentage;
        double downpayment;
        double monthlyPay;
        double monthlyRate;
        double year;
        double nPayments;
        double price;
        double principal;

        System.out.print("How much would you like to borrow?: "); //Prompts the user for their desired amount to borrow
        price = input.nextDouble();

        System.out.print("how much would your ideal downpayment percentage would be?(eg. 20%): "); //Prompts user for their downpayment percentage
        String downInput = input.next();
        downInput = downInput.replace("%", ""); //removes the % in case the user includes it
        downpaymentPercentage = Double.parseDouble(downInput); //converts the string into a double
        downpaymentPercentage = downpaymentPercentage / 100; //converts the input into a percentage

        System.out.print("What would your annual interest rate be?(eg. 5%): "); //prompts the user for their annual interest rate
        String rateInput = input.next();
        rateInput = rateInput.replace("%", ""); //same process as in downpayment
        annualRate = Double.parseDouble(rateInput); //same as in downpayment
        monthlyRate = annualRate / 12 / 100; //transforms the annual rate into the monthly rate and turns it into a percentage

        System.out.print("What would be your duration of payment?(in years): "); //prmmpts the user for their desired mortgage term
        year = input.nextDouble();
        nPayments = year * 12;

        //Computing for the monthlyPay
        downpayment = price * downpaymentPercentage;
        principal = price - downpayment;
        double sub = Math.pow(1 + monthlyRate, nPayments);
        monthlyPay = (principal * monthlyRate * sub) / (sub - 1);
        annualPay = monthlyPay * 12;

        //Displays the ideal Downpayment, Monthly Payment and then Annual Payment
        System.out.println("Ideal downpayment based on percentage(" + (downpaymentPercentage*100) + "%): " + downpayment);
        System.out.printf("Monthly payment: %.2f \n", monthlyPay);
        System.out.printf("Annual payment: %.2f \n", annualPay);

        input.close();
    }
}
