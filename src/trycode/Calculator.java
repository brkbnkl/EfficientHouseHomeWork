package trycode;

public class Calculator {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("*********************");
            System.out.println("CALCULATOR");
            System.out.println("1.ADD\n" +
                               "2.DIFF\n" +
                               "3.MULTIPLY\n" +
                               "4.DIVIDE");
            System.out.println("*********************");
            System.out.println("Please enter a process:");
            int process = kb.nextInt();

            if (process == 1)
                add();
            else if (process == 2)
                diff();
            else if (process == 3)
                multiply();
            else if (process == 4)
                divide();
            else
                System.out.println("Wrong process..please select again");
        }
    }
    public static void add()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Write number until 0 is entered :");
        int i;
        int result = 0;

        while ((i = kb.nextInt()) != 0) {
            result += i;
        }
        System.out.println("Sum of numbers : " + result);
    }
    public static void diff()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("enter first number:");
        int a = kb.nextInt();
        System.out.println("enter second number:");
        int b = kb.nextInt();
        System.out.printf("%d - %d : %d" , a,b,(a-b));
    }
    public static void multiply ()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("enter first number:");
        int a = kb.nextInt();
        System.out.println("enter second number:");
        int b = kb.nextInt();
        System.out.printf("%d * %d : %d" , a,b,(a*b));
    }
    public static void divide()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("enter first number:");
        int a = kb.nextInt();
        System.out.println("enter second number:");
        int b = kb.nextInt();
        System.out.printf("%d / %d : %.2f%n" , a,b,(a/(float)b));
    }


}
