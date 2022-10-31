package erenhomeworks1;
import java.util.Scanner;
import static java.lang.Math.min;

public class Homework1 {
    public static void main(String[] args)
    {
        run();
    }
    public  static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("First Number : ");
        int a = kb.nextInt();

        System.out.print("Second Number : ");
        int b  = kb.nextInt();

        System.out.print("Third Number : ");
        int c  = kb.nextInt();

        sortByNumber(a,b,c);
    }
    public static void sortByNumber(int a, int b, int c)
    {
        int min = min(a, min(b, c));
        int max = max(a, max(b,c));
        int mid = a + b + c - (min + max);

        if (min < mid)
            System.out.printf("%d < %d ", min , mid);
        else
            System.out.printf("%d = %d ", mid , mid);

        if (mid < max)
            System.out.printf("< %d ", max);
        else
            System.out.printf("= %d ", max);
    }
    public static int max(int a, int b)
    {
        return a >= b ? a : b;
    }
    public static int mid (int a, int b)
    {
        return a <= b ? a : b;
    }
}

/* if (a > b && a >= c) {
            if (b > c)
                System.out.println(a + ">" + b + ">" + c);
            else if (b == c)
                System.out.println(a + ">" + b + "=" + c);
            else if (a == c)
                System.out.println(a + "=" + c + ">" + b);
            else
                System.out.println(a + ">" + c + ">" + b);
        }
        else if (b > a && b >= c)  {
            if (a > c)
                System.out.println(b + ">" + a + ">" + c);
            else if (a == c)
                System.out.println(b + ">" + a + "=" + c);
            else if (b == c)
                System.out.println(b + "=" + c + ">" + a);
            else
                System.out.println(b + ">" + c + ">" + a);
        }
        else if (c > a && c >= b) {
            if (a > b)
                System.out.println(c + ">" + a + ">" + b);
            else if (a == b)
                System.out.println(c + ">" + a + "=" + b);
            else if (a == c)
                System.out.println(c + "=" + a + ">" + b);
            else
                System.out.println(c + ">" + b + ">" + a);
        }
        else {
            System.out.println(a + "=" + b + "=" + c);
        }
        */