package chapter02homeworks;

import java.util.Scanner;

public class Question4 {

    public static final double SweetenerFraction = 0.001;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the amount of sweetener required to kill the mouse:");
        double amountSweetenerToKillMouse =scan.nextDouble(); //0.00011
        System.out.println("enter the weight of the mouse in kg:");
        double weightOfMouse =scan.nextDouble(); //0.25
        System.out.println("enter the weight of the dieter:");
        double weightOfDieter =scan.nextInt();  //100
        System.out.println("enter the weight to be reached in kg:");
        double desiredWeightOfDieter =scan.nextInt(); //80

        int safeUseSoda = (int)(((amountSweetenerToKillMouse / weightOfMouse) * desiredWeightOfDieter) / SweetenerFraction);

        System.out.println("To lose " + (weightOfDieter - desiredWeightOfDieter) + " kg");
        System.out.println("Safe soda limit to have : " + safeUseSoda);
    }
}
