import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int num;
        boolean isRunning = true; 
        while (isRunning){
            System.out.println("Welcome to TO DIDDY list");
            System.out.println("1. Add");
            System.out.println("2. Show the list");
            System.out.println("3. exit");

            int choice = 0;
            boolean validChoice = false;
            while (validChoice == false) {
                try { //Exception handling on the mismatch of user input type (program will only accept int types).
                    System.out.print("Choose an action to move forward: ");
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice < 1 || choice > 3) { //if input is negative
                        System.out.print("INVALID INPUT! Please input a non-negative number between 1 and 3.");
                        input.nextLine(); //clears invalid input
                    }
                    else {
                        validChoice = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.print("INVALID INPUT! Please input a number in the field.");
                    input.nextLine();
                }
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Type your to-do items. Type 'done' when finished:"); //if the user types done
                    while (true) {
                        System.out.print("Input to do: ");
                        String item = input.nextLine();
                        if (item.equalsIgnoreCase("done")) {
                            break;
                        }
                        list.add(item);
                    }
                }
                case 2 -> {
                    System.out.println("To do list:");
                    for (int i = 0; i < list.size(); i++) {
                        num = i + 1;
                        System.out.println(num + ". " + list.get(i));
                        
                    }
                }
                case 3 -> {
                    System.out.println("Session ended.");
                    isRunning = false;
                }
            }
        }
        input.close();
    }
}
