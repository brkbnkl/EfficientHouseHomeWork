package chapter03homeworks;

public class Armstrong {
    public static void main(String[] args)
    {
       userInputNumbers();
    }
    public static void userInputNumbers()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        do {
            System.out.print("Please enter the first number : ");
            int firstNumber = kb.nextInt();

            System.out.print("Please enter the last number : ");
            int lastNumber = kb.nextInt();

            checkNumbers(firstNumber, lastNumber);

            System.out.print("For exit press 'q'\n" +
                    "For continue press 'c'\n");

        } while (kb.next().charAt(0) != 'q');
    }
    public static void checkNumbers(int firstNumber, int lastNumber)
    {
        boolean hasAnyArmstrong = false;

        while (firstNumber <= lastNumber) {
            if (isArmstrong(firstNumber)) {
                System.out.printf("%d number is Armstrong Number.%n", firstNumber);
                hasAnyArmstrong = true;
            }
            firstNumber++;
        }
        if (!hasAnyArmstrong)
            System.out.println("there is no any armstrong number between input numbers");
    }
    public static int run(int number)
    {
        int digit = countDigits(number);
        int num2 = number;
        int bd = 0;
        int result = 0;

        while (num2 != 0) {
            bd = num2 % 10;
            result += pow(bd, digit);
            num2 /= 10;
        }
        return result;
    }
    public static boolean isArmstrong(int number)
    {
        return number == run(number) && number > 0;
    }
    public static int pow(int a, int b)
    {

        int result = 1;

        while (0 < b--) {
            result *= a;
        }
        return result;
    }
    public static int countDigits(int number)
    {
        int count = 0;

        do {
            count ++;
            number /= 10;
        } while (number != 0);

        return count;
    }
}
