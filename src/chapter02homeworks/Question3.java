package chapter02homeworks;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first words:");
        String first = scan.nextLine();   //walt
        System.out.println("Enter second words:");
        String last =scan.nextLine(); //savitch

        String result = result(first) + " " + result(last);
        System.out.println(result);  //"Erkbay Enkelbay"

    }

    public static String result(String str) {
        str = str.trim();
        return str.substring(1,2).toUpperCase() + str.substring(2) + str.substring(0,1) + "ay";
    }
}
