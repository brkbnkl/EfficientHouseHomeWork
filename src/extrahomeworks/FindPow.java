package extrahomeworks;

public class FindPow {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Taban sayısını giriniz:");
        int x = kb.nextInt();

        System.out.println("Üst sayısını giriniz:");
        int y = kb.nextInt();

        System.out.printf("%d sayısının %d üstü : %d ",x,y,pow(x,y));

        pow(x,y);
    }
    public static int pow(int x,int y)
    {
        int result = 1;

        while (0 < y--) {
            result *=  x;
        }
        return result;
    }
}
