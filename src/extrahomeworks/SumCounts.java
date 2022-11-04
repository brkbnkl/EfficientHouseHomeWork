package extrahomeworks;

public class SumCounts {

    public static void main(String[] args) {

        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a number:");
        int val = input.nextInt();

        if (val < 0)
            System.out.println(negatives(val));

        if (val > 0)
            System.out.println(positives(val));
    }
    public static int negatives(int a)
    {
        int sum = 0;
        int count = 0;

        while (count-- > a)  {

            sum += count;
        }
           return sum;
    }

    public static int positives(int a)
    {
        int sum = 0;
        int count = 0;

        while (count++ < a)
        {
            sum += count;
        }
        return sum;
    }

}
