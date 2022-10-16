package ChapterHomework.Homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Minimum ağırlığı girin:");
        int minWeight =scan.nextInt(); //110
        System.out.println("Ayak cinsinden yüksekliği girin:");
        int heightFeet =scan.nextInt(); //6
        int heightInch = heightFeet * 12;
        int bodyWeight = minWeight + (heightFeet %60) *5;

        System.out.printf("Height : " + heightFeet + " " + "Ideal body weight :" + bodyWeight);
    }
}
