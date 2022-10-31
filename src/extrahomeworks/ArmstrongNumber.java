package extrahomeworks;

/*                               EXTRA HOMEWORK
        Parametresi ile aldığı int türden bir sayının Armstrong
        sayısı olup olmadığını test eden isArmstrong
        isimli metodu NumberUtil sınıfı içerisinde yazınız.

        Açıklamalar:
        - Bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında
        sayının kendisine eşitse bu sayıya Armstrong
        sayısı denir.

        Örneğin:

        153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153

        - Kuvvet alma işlemi için yazılmış olan pow metodunu kullanınız

        - Sayı negatif ise Armstrong sayısı kabul etmeyiniz

        - Metodu, 1 basamaklı, 2 basamaklı, 3 basamaklı,
                  4 basamaklı, 5 basamaklı ve 6 basamaklı
                  Armstrong sayılarını ekrana yazdırarak test ediniz
    */

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        int limit = 0;

        while (limit++ <= 999999) {

            if (isArmstrong(limit)) {
                System.out.printf("%d sayısı Armstrong sayıdır.%n", limit);
            }
        }
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
