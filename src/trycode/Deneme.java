package trycode;

public class Deneme {
    public static void main(String[] args)
    {
        add();
    }
    public static void add() {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter numbers:");
        int i;
        int toplam = 0;

        while ((i = kb.nextInt()) != 0) {
            toplam += i;
        }
        System.out.println("rakamların toplamı: " + toplam);
    }

}
