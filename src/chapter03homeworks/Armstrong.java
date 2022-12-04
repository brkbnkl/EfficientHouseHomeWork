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
        int digit = countDigits(number); //3
        int num2 = number; //153
        int baseNumber;
        int result = 0;

        while (num2 != 0) {
            baseNumber = num2 % 10; //3 - 5  - 1
            result += pow(baseNumber, digit); //27 - 152 - 153
            num2 /= 10; //15 - 1 - 0
        }
        return result; //153
    }
    public static boolean isArmstrong(int number)
    {
        return number > 0 && number == run(number);  //true
    }
    public static int pow(int a, int b)  //int a = baseNumber = 3 - int b = digit = 3 (for 153 example)
    {
        int result = 1;

        while (0 < b--) {
            result *= a;  //result = result * a
        }
        return result;
    }
    public static int countDigits(int number)  //153
    {
        int count = 0;

        do {
            number /= 10;   // number = 15  -  number = 1  - number = 0
            count ++;   //1  -  2  - 3
        } while (number != 0);   //true - true  - false

        return count;   // 3
    }
}
