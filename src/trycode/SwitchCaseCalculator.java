package trycode;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("enter first number: ");
        int number1 = kb.nextInt();
        System.out.println("Enter second number: ");
        int number2 = kb.nextInt();
        System.out.println("enter an operator : ( + , - , * , / )");
        char operator = kb.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + (number1 / (float)number2));
                break;
            default:
                System.out.println("Wrong select...pls try again");
        }
    }
}
