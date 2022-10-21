package erenhomeworks1;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Second Number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Third Number :");
        int thirdNumber = scanner.nextInt();
        mid(firstNumber,secondNumber,thirdNumber);

    }

    public static int mid(int a,int b,int c) {

        int max;

        if (a > b && a>c)
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);

        else if (b > a && b > c)
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        else
            if (a > b)
            System.out.println(a);
            else
                System.out.println(b);

        return a;

    }
}

