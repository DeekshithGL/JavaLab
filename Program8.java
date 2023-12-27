import java.util.Scanner;

public class Program7 {
    int numerator, denominator;

    public void checkDivision(int a, int b) {
        numerator = a;
        denominator = b;

        try {
            if (numerator >= 0 && denominator >= 0) {
                if (denominator != 0) {
                    System.out.println("Value of division: " + (double) (numerator / denominator));
                } else {
                    throw new ArithmeticException("Cannot divide by 0");
                }
            } else {
                System.out.println("Enter a positive number for both numerator and denominator.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter two positive numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        Program7 obj = new Program7();
        obj.checkDivision(a, b);
    }
}
