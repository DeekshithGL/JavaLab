// Write a Java program to define a base class person which stores information about a person such as name, age, gender.
// Derive two new classes: employee and student from person class to read and display the details that are specific to student and employee. 
// Demonstrate the above scenario to read and display at least 5 students and 5 employees.


import java.util.Scanner;


public class person {
    protected int age;
    protected String name;
    protected String gender;


    public void readDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the gender: ");
        gender = sc.nextLine();
    }


    public void printDetails(){
        System.out.printf("%10s\t%3d\t%6s", name, age, gender);
    }
}


class student extends person{
    int studentID;
    String collegeName;
    float cgpa;


    public void readStudentDetails(){
        Scanner sc = new Scanner(System.in);
        readDetails();
        System.out.print("Enter the student ID of the student: ");
        studentID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the college of the student: ");
        collegeName = sc.nextLine();
        System.out.print("Enter the cgpa of the student: ");
        cgpa = sc.nextFloat();
    }


    public void printStudentDetails(int i){
        System.out.print(i + "\t");
        printDetails();
        System.out.printf("%10d\t%25s\t%2.2f\n", studentID, collegeName, cgpa);
    }
}


class employee extends person{
    int empID;
    String designation;
    double salary;


    public void readEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        readDetails();
        System.out.print("Enter the ID of the employee: ");
        empID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the designation of the employee: ");
        designation = sc.nextLine();
        System.out.print("Enter the salary of the employee: ");
        salary = sc.nextDouble();
    }


    public void printEmployeeDetails(int i){
        System.out.print(i + "\t");
        printDetails();
        System.out.printf("%11d\t%20s\t%7.2f\n", empID, designation, salary);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n1 = sc.nextInt();
        student[] s = new student[n1];


        for(int i = 0; i < n1; i++){
            System.out.println("\nEnter the details of the student " + (i + 1) + ": ");
            s[i] = new student();
            s[i].readStudentDetails();
        }


        System.out.println("\nStudent Database:\n");
        System.out.printf("%s\t%10s\t%3s\t%6s\t%s\t%25s\t%4s\n", "Sl No", "Name", "Age", "Gender", "Student ID", "College Name", "CGPA");
        for(int i = 0; i < n1; i++){
            s[i].printStudentDetails(i + 1);
        }


        System.out.print("\n\nEnter the number of employees: ");
        int n2 = sc.nextInt();
        employee[] e = new employee[n2];


        for(int i = 0; i < n2; i++){
            System.out.println("\nEnter the details of the employee " + (i + 1) + ": ");
            e[i] = new employee();
            e[i].readEmployeeDetails();
        }


        System.out.println("Employee Database: \n");
        System.out.printf("%s\t%10s\t%3s\t%6s\t%s\t%20s\t%4s\n", "Sl No", "Name", "Age", "Gender", "Employee ID", "Designation", "Salary");
        for(int i = 0; i < n2; i++){
            e[i].printEmployeeDetails(i + 1);
        }
    }
}
