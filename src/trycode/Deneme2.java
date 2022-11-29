package trycode;

public class Deneme2 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        int sayi1 = kb.nextInt();
        System.out.println("Enter second number: ");
        int sayi2 = kb.nextInt();
        toplama(sayi1,sayi2);
        System.out.println(yasBul(33));
    }
    public static void toplama(int a, int b)
    {
        System.out.println("sayıların toplamı : " + (a + b));
    }
    public static String yasBul(int yaş)
    {
        int yıl = 2022 - yaş;
        return yıl + " yılında doğdunuz";
    }
}
