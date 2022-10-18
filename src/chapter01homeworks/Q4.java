package chapter01homeworks;

public class Q4 {

    public static final double SweetenerFraction = 0.001;

    public static void main(String[] args) {

        double amountSweetenerToKillMouse = 0.00011;
        double weightOfMouse = 0.25;
        double weightOfDieter = 100;
        double desiredWeightOfDieter = 80;

        int safeUseSoda = (int)(((amountSweetenerToKillMouse / weightOfMouse) * desiredWeightOfDieter) / SweetenerFraction);

        System.out.println("To lose " + (weightOfDieter - desiredWeightOfDieter) + " kg");
        System.out.println("Safe soda limit to have : " + safeUseSoda);
    }
}
