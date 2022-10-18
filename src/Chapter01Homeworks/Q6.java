package Chapter01Homeworks;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        int principalAmount =1000;
        double interestRate =5.0;
        int numberOfYears =5;
        double simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;
        System.out.println(simpleInterest);

    }
}
