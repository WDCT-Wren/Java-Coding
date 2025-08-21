import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //initiates the scanner or the prompter for user input
        
        //The following used to intialize the four main variables that will be used in the project
        double n1;
        double n2;
        char operator; 
        double output = 0;
        boolean validOperator = true; 

        

        System.out.print("Input the first real number: "); //prompts the user for any real number
        n1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): "); //promts the user to choose an operator 
        operator = input.next().charAt(0);

        System.out.print("Input the second real number: "); //prompts the user for another real number to which will be computed with the first real number
        n2 = input.nextDouble();

        //switch case was used since there are more than 3 cases and would be more efficient than using 5 if else statements
        switch(operator){ //checks the char of the value, "operator" to determine what operation was used
            case '+' -> output = n1 + n2; //if user chooses to add
            case '-' -> output = n1 - n2; //if user chooses to subtract
            case '*' -> output = n1 * n2; //if user chooses to multiply
            case '/' -> {
                if (n2 == 0) {
                    System.out.println("Cannot divide by 0!"); //just in case the user inputted the second number to be a zero
                    validOperator = false; //ends the process since it's false
                }
                else {
                    output = n1 / n2; //if user chooses to divide with a real non-zero number
                }
            }
            case '^' -> output = Math.pow(n1, n2);
            default -> { //if user inputs a character that are not in the choices
                System.out.println("Invalid Operator!");
                validOperator = false; //ends the process since it's false
            }
        }

        if (validOperator) {
        System.out.println(output); //moves forward only if the operator is valid
        }

        input.close();
    }
}
