package Chapter02Homeworks;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cümleyi giriniz:");
        String text =scan.nextLine(); //I hate you

        System.out.println(text.replace("hate","love"));
    }
}
