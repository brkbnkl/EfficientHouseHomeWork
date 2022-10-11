package ChapterHomework.Homework6;

public class Main {
    public static void main(String[] args) {

        int princiAmount = 1000;
        double interestRate = 5.0;
        int numberOfYears = 5;

        double simpleInterest = (princiAmount * interestRate * numberOfYears) / 100;
        System.out.println(simpleInterest);

    }
}
