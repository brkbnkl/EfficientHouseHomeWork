package ChapterHomework.Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ana para tutarını girin:");
        int principalAmount =scan.nextInt(); //1000
        System.out.println("Faiz oranını girin:");
        double interestRate =scan.nextDouble(); //5.0
        System.out.println("Yılı girin:");
        int numberOfYears =scan.nextInt(); //5

        double simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;
        System.out.println(simpleInterest);

    }
}
