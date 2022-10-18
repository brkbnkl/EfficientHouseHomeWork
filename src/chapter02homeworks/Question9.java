package chapter02homeworks;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the minimum kg:");
        int minWeight =scan.nextInt(); //110
        System.out.println("Enter height in feet:");
        int heightFeet =scan.nextInt(); //6
        int heightInch = heightFeet * 12;
        int bodyWeight = minWeight + (heightFeet %60) *5;

        System.out.printf("Height : " + heightFeet + " " + "Ideal body weight :" + bodyWeight);
    }
}
