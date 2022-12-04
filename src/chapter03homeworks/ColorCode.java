package chapter03homeworks;

public class ColorCode {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        String currentChar = "";
        String pattern = "";

        System.out.println("Your Pattern is " + color(currentChar, pattern).toUpperCase());
    }
    public static String color(String currentChar, String pattern)
    {
        for (int i = 0; i < 5; ) {

            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("enter a color: ");

            String previousChar = currentChar;

            currentChar = kb.next();

            if (!(currentChar.equalsIgnoreCase("R") || currentChar.equalsIgnoreCase("G") || currentChar.equalsIgnoreCase("B")))
                System.out.println("Invalid Input");

            else if (previousChar.equals(currentChar))
                System.out.println("Invalid Input");

            else {
                i++;
                pattern += currentChar;
            }
        }
        return pattern;
    }
}
