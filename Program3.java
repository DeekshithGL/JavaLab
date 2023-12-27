// Write a Java program using encapsulation and constructors to represent a complex number and perform the following operations:
// 1. Addition of two complex numbers
// 2. Subtraction of two complex numbers
// 3. Incrementing a complex number
// 4. Decrementing a complex number
// 5. Comparing two complex numbers

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, a, b;

        do {
            System.out.print(
                    "\n\n**********MAIN MENU**********\n1. Addition of two complex numbers:\n2. Subtraction of two complex numbers:\n3. Incrementing a complex number:\n4. Decrementing a complex number:\n5. Comparing two complex numbers:\n6. Exit\nEnter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter the real and imaginary parts of first complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c1 = new complex(a, b);

                    System.out.print("Enter the real and imaginary parts of second complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c2 = new complex(a, b);

                    c1.add(c2);
                    break;

                case 2:
                    System.out.print("Enter the real and imaginary parts of first complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c3 = new complex(a, b);

                    System.out.print("Enter the real and imaginary parts of second complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c4 = new complex(a, b);

                    c3.subtract(c4);
                    break;

                case 3:
                    System.out.print("Enter the real and imaginary parts of the complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c5 = new complex(a, b);

                    c5.increment();
                    System.out.print("Complex number after incrementing: ");
                    c5.display();
                    break;

                case 4:
                    System.out.print("Enter the real and imaginary parts of the complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c6 = new complex(a, b);

                    c6.decrement();
                    System.out.print("Complex number after decrementing: ");
                    c6.display();
                    break;

                case 5:
                    System.out.print("Enter the real and imaginary parts of first complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c7 = new complex(a, b);

                    System.out.print("Enter the real and imaginary parts of second complex number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    complex c8 = new complex(a, b);

                    c7.compare(c8);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice! Try again");
                    break;
            }
        } while (ch != 6);
    }
}

class complex {
    int real, imaginary;

    public complex() {
        real = 0;
        imaginary = 0;
    }

    public complex(int a, int b) {
        real = a;
        imaginary = b;
    }

    void add(complex c) {
        complex c3 = new complex();
        c3.real = real + c.real;
        c3.imaginary = imaginary + c.imaginary;

        System.out.print("Added complex number is ");
        c3.display();
    }

    void subtract(complex c) {
        complex c3 = new complex();
        c3.real = real - c.real;
        c3.imaginary = imaginary - c.imaginary;

        System.out.print("Subtracted complex number is ");
        c3.display();
    }

    void increment() {
        real++;
        imaginary++;
    }

    void decrement() {
        real--;
        imaginary--;
    }

    void compare(complex c) {
        if (real == c.real && imaginary == c.imaginary)
            System.out.println("Complex numbers are equal");
        else
            System.out.println("Complex numbers are not equal");
    }

    void display() {
        System.out.println(real + " + i" + imaginary);
    }
}
