package erenhomeworks1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner kb =  new Scanner(System.in);

        System.out.print("First Number : ");
        int a = kb.nextInt();
        System.out.print("Second Number : ");
        int b  = kb.nextInt();
        System.out.print("Third Number : ");
        int c  = kb.nextInt();
        sortByNumber(a,b,c);

    }
    public static int sortByNumber(int a,int b,int c) {

        if (a > b && a >= c) {
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

        return a;
    }
}
