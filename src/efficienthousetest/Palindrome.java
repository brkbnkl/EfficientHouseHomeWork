package efficienthousetest;

public class Palindrome {
    public static void main(String[] args) {

        for (int number = 10; number <= 100; number++) {

        }

    }

    public static int getReverse(int number) {

        int result = 0;

        while (number > 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }

        return result;
    }
}
