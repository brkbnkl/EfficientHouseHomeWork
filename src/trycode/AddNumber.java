package trycode;

public class AddNumber {
    public static void main(String[] args) {

        int toplam = 0;

        while (true) {

            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            int sayi = kb.nextInt();

            if (sayi == 0) {
                System.out.println("0 girdiniz..girilen değerler toplanıyor");
                break;
            }

            toplam = toplam + sayi;
        }

        System.out.println("sayıların toplamı : " + toplam);
    }
}
