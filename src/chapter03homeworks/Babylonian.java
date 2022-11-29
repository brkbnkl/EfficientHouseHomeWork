package chapter03homeworks;

public class Babylonian {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        double n = kb.nextDouble();

        System.out.printf("The square root of %.0f is %.2f" , n,babylonian(n));
    }
    public static double babylonian(double n)
    {
        double guess = n/2;

        while (true) {
            double previousGuess = guess;
            double r = n / guess;
            guess = (guess + r) / 2;

            if ((guess / 100) > (previousGuess - guess))
                break;
        }
        return guess;
    }
}
