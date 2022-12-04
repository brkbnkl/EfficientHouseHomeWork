package efficienthousetest;

public class Factoriel {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int number = kb.nextInt();
        int fakt = factoriel(number);

    }

    public static int run(int number)
    {
        int digit = countDigits(number);
        int num2 = number;
        int baseNumber;
        int result = 0;

        while (num2 != 0) {
            baseNumber = num2 % 10;
            result += pow(baseNumber, digit);
            num2 /= 10;
        }
        return result;
    }

    public static int factoriel(int number) {

        int faktoriyel = 1;

        for (int i = 1 ; i <= number; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }

    public static int pow(int a, int b)
    {
        int result = 1;

        while (0 < b--) {
            result *= a;
        }
        return result;
    }

    public static int countDigits(int number)  //153
    {
        int count = 0;

        do {
            number /= 10;
            count ++;
        } while (number != 0);

        return count;
    }

    public static boolean isArmstrong(int number)
    {
        return number > 0 && number == run(number);
    }
}
