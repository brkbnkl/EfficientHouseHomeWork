package extrahomeworks;

public class PrimeNumber {

    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        for (long a = 2 ; a < 999999 ; a++) {
            if (isPrime(a))
                System.out.printf("%d sayısı asaldır%n", a);
        }
    }
    public static boolean isPrime(long val)
    {
        for (long i = 2; i <= val / 2; i+=2) {
            if (val %i == 0)
                return false;
        }
        return true;
    }
}
