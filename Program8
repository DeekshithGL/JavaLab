//Write a java program to read two positive integers and perform the division operation on them and display the result if a user enters a positive integer and non-zero denominator. 
//Else, If the input is negative or the denominator is zero, generate negative number input and divide by zero exception to handle the scenario.

import java.util.Scanner;

public class program7 {
    int numerator, denominator;

    public void checkDivision (int a, int b){
        numerator = a;
        denominator = b;

        try {
            if(numerator >= 0 && denominator >= 0)
                if(denominator != 0)
                    System.out.println("Value of division: " + (double) (numerator / denominator));
                else
                    System.out.println("Cannot divide by 0");
            else
                System.out.println("Enter a positive number for both numerator and denominator.");
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Enter two positive numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        program7 obj = new program7();
        obj.checkDivision(a, b);
    }
}
