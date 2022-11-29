package chapter03homeworks;

public class InflationRate {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Enter the cost of item:");
        double inputCost = kb.nextDouble();

        System.out.println("After years:");
        int inputYears = kb.nextInt();

        System.out.println("Enter rate of inflation:");
        double inputRate = kb.nextDouble() / 100;

        System.out.printf("The cost after %d years will become %.2f" , inputYears , calculateCostByYear(inputCost , inputYears , inputRate));
    }
    public static double calculateCostByYear(double cost , int years , double rate)
    {
        for (int i = 0 ; i < years ; i++)
                cost += cost * rate;

        return cost;
    }
}
