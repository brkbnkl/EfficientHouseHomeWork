package chapter02homeworks;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        int principalAmount =scan.nextInt(); //1000
        System.out.println("Enter the interest rate:");
        double interestRate =scan.nextDouble(); //5.0
        System.out.println("Enter the year:");
        int numberOfYears =scan.nextInt(); //5

        double simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;
        System.out.println(simpleInterest);

    }
}
