import java.util.Scanner;

public class stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        sc.close();
    }
}
