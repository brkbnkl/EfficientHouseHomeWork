package chapter03homeworks;

public class StereoSystem {

    public static void main(String[] args)
    {
        double debt = 1000;
        double interestRate = 1.5;
        int count = 0;
        double totalInterestPaid = 0;
        double monthlyPayment = 50;
        double interestAmount;

        while (debt > 0) {
            totalInterestPaid += debt / 100 * interestRate;
            interestAmount = debt / 100 * interestRate;
            monthlyPayment -= interestAmount;
            debt -= monthlyPayment;
            monthlyPayment = 50;
            count++;
        }
        System.out.printf("The total amount of interest you paid for Stereo you bought : %.2f$%n" +
                "The number of months you paid : %d", totalInterestPaid, count);
    }
}
