// Write a Java Program to define a base class called BANK which holds various details of customers such as name, ac no, balance and 
// member functions to read, display and calculate the rate of interest earned by all the account holders.
// Derive three new classes namely Citi Bank, SBI Bank, Canara Bank from this base class which are offering difference rate of interest.
// Extend the calculate method of base class within these derived classes to calculate and display the interest earned by account holders of these banks.

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        SBI[] sbi = new SBI[3];
        CanaraBank[] canara = new CanaraBank[3];
        CitiBank[] citi = new CitiBank[3];

        System.out.println("Enter the details of the Citi Bank customers: ");
        for(int i = 0; i < 3; i++){
            citi[i] = new CitiBank();
            System.out.println("Account " + (i + 1));
            citi[i].read();
        }

        System.out.println("Enter the details of the SBI customers: ");
        for(int i = 0; i < 3; i++){
            sbi[i] = new SBI();
            System.out.println("Account " + (i + 1));
            sbi[i].read();
        }

        System.out.println("Enter the details of the Canara Bank customers: ");
        for(int i = 0; i < 3; i++){
            canara[i] = new CanaraBank();
            System.out.println("Account " + (i + 1));
            canara[i].read();
        }

        System.out.println("Details of Citi Bank customers: ");
        System.out.printf("%25s\t%15s\t%8s\t%s\t%s\n", "Name", "Ac No", "Balance", "Rate of Interest", "Interest");
        for(int i = 0; i < 3; i++){
            citi[i].calculate();
            citi[i].display();
        }

        System.out.println("Details of SBI customers: ");
        System.out.printf("%25s\t%15s\t%8s\t%s\t%s\n", "Name", "Ac No", "Balance", "Rate of Interest", "Interest");
        for(int i = 0; i < 3; i++){
            sbi[i].calculate();
            sbi[i].display();
        }

        System.out.println("Details of Canara Bank customers: ");
        System.out.printf("%25s\t%15s\t%8s\t%s\t%s\n", "Name", "Ac No", "Balance", "Rate of Interest", "Interest");
        for(int i = 0; i < 3; i++){
            canara[i].calculate();
            canara[i].display();
        }
    }
}
class BANK{
    String name;
    long acNo;
    double balance;
    float rateOfInterest;
    double interest;

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the account holder: ");
        name = sc.nextLine();
        System.out.print("Enter the account number: ");
        acNo = sc.nextLong();
        System.out.print("Enter the balance in the account: ");
        balance = sc.nextDouble();        
    }

    void display(){
        System.out.printf("%25s\t%15d\t%8f\t", name, acNo, balance);
    }

    void calculate(){

    }
}

class CitiBank extends BANK{
    float rateOfInterest = (float)0.3;
    @Override
    void calculate(){
        interest = balance * (double)rateOfInterest;
    }
    @Override
    void display(){
        super.display();
        System.out.printf("%1.2f\t%16f\n", rateOfInterest, interest);
    }
}

class SBI extends BANK{
    float rateOfInterest = (float)0.25;
    @Override
    void calculate(){
        interest = balance * rateOfInterest;
    }
    @Override
    void display(){
        super.display();
        System.out.printf("%1.2f\t%16f\n", rateOfInterest, interest);
    }
}

class CanaraBank extends BANK{
    float rateOfInterest = (float)0.2;
    @Override
    void calculate(){
        interest = balance * rateOfInterest;
    }
    @Override
    void display(){
        super.display();
        System.out.printf("%1.2f\t%16f\n", rateOfInterest, interest);
    }
}
