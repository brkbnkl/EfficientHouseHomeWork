package extrahomeworks;

public class ErenHocaHomework {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        System.out.println("Number of digits: " + countDigitsWithDo(number));
    }
    public static int countDigitsWithDo(int number)
    {

        int count = 0;

        do{
            number /= 10;
            count++;
        }while (number != 0);

        return count;
    }

    public static int countDigitsWithWhile(int number)
    {

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int countDigitsWithFor(int number)
    {

        int count;

        for (count = 0; number !=0; count++) {
            number /= 10;
        }

        return count;
    }

}
