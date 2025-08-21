/*Password strength checker that utilizes string manipulation and control flow methods and scanners primarily. The only constraint I had in this project is that I haven't used helper methods yet.
 This can be improved further and further, but I'm just simply studying string manipulation so there are no benefits in including them when I'm not familiar with it just yet hahaha.
 
 Good luck sa programming journey mo, self. 
 if babalikan mo man to one day, alamin mo na ngayong sinusulat ko to wala pa ako alam masyado sa programming. 
 I hope maraimi ka nang alam if you ever come back here 2 years from now after forgetting about this I guess hahaha.
 
 - Wren Daniel C. Tulio (August 21, 2025)*/

//Day 2 (String manipulation and loop methods)
import java.util.Scanner;

public class passwordStrengthChecker {
    public static void main(String[] args) {
        //Initializes scanner
        Scanner input = new Scanner(System.in);

        //initiallizes variables
        String userPass = "";
        String specialChar = "!@#$%^&*()_+-=~`{}|[];':\""; //Contains the most expected special characters in passwords which will be compared to userPass
        String numbers = "0123456789"; // variable that contains all possible numbers that will be compared to the userPass
        boolean hasSpecialChar = false; 
        boolean hasNum = false;

        System.out.print("Enter password (Must be longer than 8 characters, include at least 1 special character, and include at least 1 numerical value): "); //prompts the user for a password and gives the criterias.
        userPass = input.nextLine();

        //checks the password if it meets the criterias
        while(true){
            hasSpecialChar = false; 
            hasNum = false;
            //starts the loop with the both special criterias as false. 

            if (userPass.length() < 8){ //Cheap checks the first criteria which is if the string is longer than 8 characters
                System.out.println("Weak Password! (Too short)"); 
                System.out.print("Input revised password: ");
                userPass = input.nextLine();
                continue;
            }
            else {
                //Checker loop to check the password if the password both contains a special character and numbers
                for (int i = 0; i < userPass.length(); i++){ 
                    char c = userPass.charAt(i);

                    if (specialChar.indexOf(c) != -1){ //checks the password if it includes any of the characters of the string specialChar by comparing each character to the characters of userPass, and will return true if it indeed finds a matching one.
                        hasSpecialChar = true; 
                    }

                    if (numbers.indexOf(c) != -1){ //same concept as special char check hahaha
                        hasNum = true;
                    }

                    if (hasSpecialChar && hasNum){ //If both switches are true, the loop will finish and move forward. 
                        break;
                    }
                }            
            }
            if (!hasSpecialChar){ //basically says "if hasSpecialChar is still false (!false = true), then tell the user that its a weak password and ask for a new one."
                System.out.println("Weak Password! (No Special Character)");
                System.out.print("Input revised password: ");
                userPass = input.nextLine();
                continue;
            }
            else if (!hasNum){ // same concept as above
                System.out.println("Weak Password! (No inclusion of numbers)");
                System.out.print("Input revised password: ");
                userPass = input.nextLine();
                continue;
            }
            else { //if both if and else if conditionals returns as false, it means that the password had met its criterias and is now finished.
                System.out.println("Strong password!");
                break;
            }
        }
        input.close();
    }
}
