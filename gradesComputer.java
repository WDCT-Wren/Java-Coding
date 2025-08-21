import java.util.Scanner;

public class gradesComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade_size;
        double[] grades;
        double sum = 0;
        double avgGrade = 0;
        double lowest;
        double highest;
        String gradeDistribution = " ";

        System.out.print("How many grades will you input?: "); //Prompts the user to determine the size of the array from the amount of grades they wish to input.
        grade_size = input.nextInt();
        input.nextLine();

        grades = new double[grade_size]; //initiallizes the array and uses the var grade size to determine the array size.
        
        for(int i = 0; i < grades.length; i++){
            System.out.print("Input Grades here: "); //Prompts the user to input their grades.
            grades[i] = input.nextDouble(); //reads the grades
        }

        //System.out.println("Grades inputted: "); 
        //for(int i = 0; i < grades.length; i++){
            //simply displays the grades previously inputted.
            //System.out.println(grades[i]); //uses local var i as the index, incrementing each itteration on the array grades[].
        //}
        
        //Create a for loop that passes through the arrays and processes them (Find Mean, Highest, Lowest, and Grade Distribution)
        lowest = grades[0];
        highest = grades[0];
        //Loop for finding the average grade
        for(int i = 0; i < grades.length; i++){
            sum = sum + grades[i]; 

            if (grades[i] > highest){
                highest = grades[i];
            } 
            if (grades[i] < lowest){
                lowest = grades[i];
            }
        }
        avgGrade = sum / grade_size;
        //processes the average grade to give the user their grade distribution (A, B, C, D, F)
        
        if (avgGrade <=100 && avgGrade >= 90){
            gradeDistribution = "1.00 - 1.50";
        } 
        else if (avgGrade <=89 && avgGrade >= 80){
            gradeDistribution = "1.75 - 2.25";
        }
        else if (avgGrade <=79 && avgGrade >= 70){
            gradeDistribution = "2.50 - 3.00";
        }
        else{
            gradeDistribution = "3.00 - 5.00 (Failing)";
        }

        //print the following items (Avg grade, highest grde, lowest grade, and the user's GWA based on the given grades.)
        System.out.printf("Average grade: %.2f%n", avgGrade);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("GWA: " + gradeDistribution);

        input.close();
    }
}
