package ChapterHomework.Homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Saniye değerini giriniz:");
        int seconds =scan.nextInt(); //50391

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
