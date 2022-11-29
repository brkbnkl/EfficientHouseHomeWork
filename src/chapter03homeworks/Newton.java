package chapter03homeworks;

public class Newton {
    public static void main(String[] args)
    {
        System.out.println("*** GRAVİTY CALCULATION WITH RESPECT TO PLANETS ***");
        getTransaction();
    }
    public static void getTransaction()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {

            System.out.println("Press 'Q' for quit or press 'C' for continue: ");
            String action = kb.nextLine();

            if(action.equalsIgnoreCase("q")) {
                System.out.println("Quitting the program");
                break;
            }
            else if(action.equalsIgnoreCase("c")) {

                System.out.println("Enter the weight of the car in kg: ");
                double weight = kb.nextDouble();

                kb.nextLine();

                System.out.println("Choose a planet....'E' for Earth or 'M' for Moon: ");
                String choice = kb.nextLine();

                if(choice.equalsIgnoreCase("e"))
                    weightOnEarth(weight);
                else if (choice.equalsIgnoreCase("m"))
                    weightOnMoon(weight);
                else
                    System.out.println("Please enter correct choose");
            }
            else
                System.out.println("Incorrect choice...try again");
        }
    }
    public static void weightOnEarth(double weight)
    {
        System.out.printf("Weight of the car in the earth %.2f Newton%n", weight * 9.81);
    }
    public static void weightOnMoon(double weight)
    {
        System.out.printf("Weight of the car in the moon %.2f Newton%n", weight * 9.81 / 6);
    }
}
