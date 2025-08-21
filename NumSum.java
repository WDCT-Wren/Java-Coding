import java.util.Scanner;

public class NumSum {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				int num1;
				int num2;
				
				System.out.print("Input first real number: "); //prompts the user to input the first number
				num1 = input.nextInt();
				
				System.out.print("Input second real number: "); //prompts the user to input the second number
				num2 = input.nextInt();

				int sum = num1 + num2;
				System.out.print(sum + " is the sum of the two numbers!"); //displays sum
				
				input.close(); //terminates the scanner
		}
	}