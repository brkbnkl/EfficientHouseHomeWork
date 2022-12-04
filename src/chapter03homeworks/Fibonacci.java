package chapter03homeworks;

public class Fibonacci {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter number of days: ");
        int day = kb.nextInt();
        System.out.println("Enter pound:");
        int pound = kb.nextInt();

        display(day,calculateGreenCrud(day,pound));
    }
    public static int calculateGreenCrud(int day,int oldCrudPop)
    {
        int newCrudPop = 0;
        int total = 0;

        for (int i = 0; i <= day / 5 ; i++) {
                total = oldCrudPop + newCrudPop;
                oldCrudPop = newCrudPop;
                newCrudPop = total;
        }
        return total;
    }
    public static void display(int days,int result)
    {
        System.out.printf("At the end of %d days,the green crud population is %d: " ,days,result);
    }
}
