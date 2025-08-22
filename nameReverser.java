//Day 2 (String manipulation)

import java.util.Scanner;

public class nameReverser {
    public static void main(String[] args) {
        String name;
        String reversedName = "";

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?: "); //prompts user for their name
        name = input.nextLine(); //stores the user's name in the variable "name".
        

        //Code that reverses the user's name
        for(int i = name.length() - 1; i >= 0; i--){
            reversedName += name.charAt(i);
        }
        //Displays the user's name in reverse
        System.out.println(reversedName);

        input.close();
    }
}
