/*
Day 3 (08/23/2025)
    simple number guessing game:
    the computer generates a number from 1-50 inclusive
    the user will keep guessing until they are right
    program tells the user if their guess is too low/high and will count their attempts
    
    Miniproject includes: utilizing the Random class of java, loops, and incrementation of each iteration.
*/

import java.util.Scanner;
import java.util.Random;

public class RngGame {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int guess = 0;
        int attempts = 0;
        int number = generator.nextInt(50)+1; //generates a between 1 and 50 inclusive. 
                
        //Prompts the user for their first guess
        System.out.print("Guess the secret number between 1-50: "); 
        guess = input.nextInt();

        while (true) {
            //if the user's guess was too low, it will then increment the attempt.
            if (guess < number){
                attempts++; //counts this attmempt
                System.out.print("That's too low! guess higher: ");
                guess = input.nextInt();
            }
            //if the user's guess was too high, it will then increment the attempt
            else if (guess > number){
                attempts++; //counts this attempt
                System.out.print("That's too high! guess lower:");
                guess = input.nextInt();
            }
            else { // if the user's guess was correct, it will then increment the attempt even if at the first try.
                attempts++; //counts this attempt
                System.out.println("That's correct! the secret number is indeed " + number + "!! Good job!");
                System.out.println("The amount of your attempts were: " + attempts);
                break;
            }
        }

        input.close();
    }
}
