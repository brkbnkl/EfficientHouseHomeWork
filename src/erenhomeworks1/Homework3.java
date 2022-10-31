package erenhomeworks1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Enter a number:");
        int a = kb.nextInt();

        System.out.println(signum(a));
    }
    public static int signum(int a)
    {
        if (a > 0)
           return 1;

        if (a == 0)
            return 0;

            return -1;
    }
}
