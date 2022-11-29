package trycode;

public class Denemeler {
    public static void main(String[] args) {

        while (true) {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = kb.nextInt();
            System.out.println("Enter second number: ");
            int b = kb.nextInt();
            System.out.println("Enter an operator: ");
            char operator = kb.next().charAt(0);

            if (operator == '+')
                System.out.println(a + b);
            else if (operator == '-')
                System.out.println(a - b);
            else if (operator == '*')
                System.out.println(a * b);
            else if (operator == '/')
                System.out.println(a / (float) b);
            else
                System.out.println("Wrong opeator...pls try again");
        }
    }
}
