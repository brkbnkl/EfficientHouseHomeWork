package ChapterHomework.Homework10;

public class Main {

    public static final int lethalOverdose = 11000;

    public static void main(String[] args) {

        int caffeineInCoke = 34;
        int caffeineInCoffee = 160;

        int ratioOfTheCokeToKillPerson = lethalOverdose / caffeineInCoke;
        int ratioOfTheCoffeeToKillPerson = lethalOverdose / caffeineInCoffee;

        System.out.println("Ratio of the coke to kill person : " + ratioOfTheCokeToKillPerson);
        System.out.println("Ratio of the coffee to kill person : " + ratioOfTheCoffeeToKillPerson);
    }
}
