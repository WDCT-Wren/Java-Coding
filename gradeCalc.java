import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        double rating = 0;
        double mGrade;
        double fGrade;

        System.out.print("Enter Mid-Term grade standing: ");
        mGrade = input.nextDouble();

        System.out.print("Enter Final grade Standing: ");
        fGrade = input.nextDouble();

        rating = (mGrade + fGrade) / 2;

        if (rating <= 3.00) {
            System.out.println(rating + ", Passing Score!");
        }
        else {
            System.out.println(rating + ", Failed Score.");
        }

        input.close();
    }
}
