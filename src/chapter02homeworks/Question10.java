package chapter02homeworks;

import java.util.Scanner;

public class Question10 {

    public static final int lethalOverdose = 11000;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Amount of caffeine in colan:");
        int caffeineInCoke =scan.nextInt(); //34
        System.out.println("Amount of caffeine in coffee:");
        int caffeineInCoffee =scan.nextInt(); //160

        int ratioOfTheCokeToKillPerson = lethalOverdose / caffeineInCoke;
        int ratioOfTheCoffeeToKillPerson = lethalOverdose / caffeineInCoffee;

        System.out.println("Ratio of the coke to kill person : " + ratioOfTheCokeToKillPerson);
        System.out.println("Ratio of the coffee to kill person : " + ratioOfTheCoffeeToKillPerson);
    }
}
