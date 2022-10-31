package erenhomeworks1;
import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("First Number : ");
        int a = kb.nextInt();

        System.out.print("Second Number : ");
        int b = kb.nextInt();

        System.out.print("Third Number :");
        int c = kb.nextInt();

        System.out.println("Mid Number is : " + mid(a,b,c));
    }
    public static int mid(int a, int b, int c)
    {
        if (a >= b && c >= a || c <= a && a <= b)
            return a;
        if (a <= b && b <= c || c <= b && b <= a)
            return b;

        return c;
    }
}

