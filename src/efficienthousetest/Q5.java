package efficienthousetest;

public class Q5 {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        double delta = (b *b ) - (4 * a * c);

        if(delta > 0) {
            double x1 = (-1 * b) - (delta / 2) / (2 * a);
            double x2 = (-1 * b) + (delta / 2) / (2 * a);
        }
        else if (delta < 0) {
            System.out.println("Kök yoktur");
        }
        else {
            double x = (-1 * b) / (2 * a);
            System.out.println("eşit kök vardır = " + x);
        }
    }
}
