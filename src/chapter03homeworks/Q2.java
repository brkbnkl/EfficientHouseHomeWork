package chapter03homeworks;

public class Q2 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        String previousChar = "";
        String currentChar = "";
        String pattern = "";

        System.out.println("Your Pattern is " + color(previousChar,currentChar,pattern));
    }

    public static String color(String previousChar,String currentChar, String pattern)
    {
        for (int i = 0; i < 5; i++)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("enter a color: ");
            previousChar = currentChar;
            currentChar = kb.next();

            if (!(currentChar.equals("R") || currentChar.equals("G") || currentChar.equals("B")))
            {
                System.out.println("Invalid Input");
                i--;
                break;
            }

            if (previousChar.equals(currentChar))
            {
                System.out.println("Invalid Input");
                i--;
            }else {
                pattern += currentChar;
            }
        }
        return pattern;
    }
}
