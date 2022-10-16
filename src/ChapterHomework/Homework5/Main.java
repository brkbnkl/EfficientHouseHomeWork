package ChapterHomework.Homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cümleyi giriniz:");
        String text =scan.nextLine(); //I hate you

        System.out.println(text.replace("hate","love"));
    }
}
