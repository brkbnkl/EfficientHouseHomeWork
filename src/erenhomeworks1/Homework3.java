package erenhomeworks1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        signum(a);

    }

    public static int signum(int a) {
        if (a < 0)
            System.out.println("-1");
        else if (a > 0)
            System.out.println("1");
        else
            System.out.println("0");
        return a;

    }
}
