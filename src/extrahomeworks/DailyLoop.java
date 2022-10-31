package extrahomeworks;

public class DailyLoop {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter your hourly salary:");
        int a = kb.nextInt();

        salary(a);
    }
    public static int salary(int hourlySalary)
    {
        int balance = 0;
        int workDays;

        for (workDays =0 ; workDays != 31 ; workDays++)
        {
            System.out.printf("Bugün %d inci iş günüm ve banka hesabımda %d TL param var%n", workDays, balance);
            balance += hourlySalary * 11;

        }

        if (balance < 20_000) {
        } else {
            System.out.printf("Hadi yine iyisin...maaş %.3f TL'nin üstüne :)%n", 20.000);
            System.out.println("Net maaş : " + balance + " TL");
        }
        return balance;
    }
}
