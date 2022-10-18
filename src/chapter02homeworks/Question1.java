package chapter02homeworks;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilogram : ");
        int kg = scanner.nextInt();
        System.out.print("Enter Height(Example :  1,72) : ");
        double height = scanner.nextDouble();

        double bmi = kg / (height * height);

        System.out.println("Your BMI is : " + bmi);
    }
}
