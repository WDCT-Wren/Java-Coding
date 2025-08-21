import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double height;
        double weight;
        double BMI;

        System.out.print("Enter Height in meters: ");
        height = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        weight = input.nextDouble();
        
        BMI = weight / (height*height);

        if (BMI < 18.5){
            System.out.printf("%.2f Underweight Category! %n", BMI);
        }
        else if (BMI >= 18.5 && BMI <=24.9) {
            System.out.printf("%.2f Healthy Weight Category! %n", BMI);
        }
        else if (BMI >= 25 && BMI <=29.9) {
            System.out.printf("%.2f Overweight Category! %n", BMI);
        }
        else {
            System.out.printf("%.2f Obese Weight Category! %n", BMI);
        }
        input.close();
    }
}
