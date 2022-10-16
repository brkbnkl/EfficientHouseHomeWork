package ChapterHomework.Homework4;

import java.util.Scanner;

public class Main {

    public static final double SweetenerFraction = 0.001;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fareyi öldürmek için gerekli tatlandırıcı miktarını girin:");
        double amountSweetenerToKillMouse =scan.nextDouble(); //0.00011
        System.out.println("Farenin kg cinsinden ağırlığını giriniz:");
        double weightOfMouse =scan.nextDouble(); //0.25
        System.out.println("Diyet yapan kişini ağırlığını kg cinsinden giriniz:");
        double weightOfDieter =scan.nextInt();  //100
        System.out.println("Ulaşılması gereken ağırlığı kg cinsinden giriniz:");
        double desiredWeightOfDieter =scan.nextInt(); //80

        int safeUseSoda = (int)(((amountSweetenerToKillMouse / weightOfMouse) * desiredWeightOfDieter) / SweetenerFraction);

        System.out.println("To lose " + (weightOfDieter - desiredWeightOfDieter) + " kg");
        System.out.println("Safe soda limit to have : " + safeUseSoda);
    }
}
