package chapter03homeworks;

public class Q4 {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Enter the cost of item:");
        double cost = kb.nextDouble();

        System.out.println("After years:");
        int years = kb.nextInt();

        System.out.println("Enter rate of inflation:");
        double rate = kb.nextDouble() / 100;

        System.out.printf("The cost after %d years will become %.2f" , years,calculate(cost,years,rate));
    }

    public static double calculate(double cost,int years,double rate)
    {
        for (int i = 0 ; i < years ; i++)
                cost += cost * rate;

                return cost;
    }
}
