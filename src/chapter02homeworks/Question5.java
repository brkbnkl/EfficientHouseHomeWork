package chapter02homeworks;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String text =scan.nextLine(); //I hate you

        System.out.println(text.replace("hate","love"));
    }
}
