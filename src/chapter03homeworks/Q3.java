package chapter03homeworks;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("*** GRAVİTY CALCULATION WITH RESPECT TO PLANETS ***");

        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {

            System.out.println("Press 'Q' for quit or press 'C' for continue: ");
            String action = kb.nextLine();

            if(action.equals("Q") || action.equals("q")) {
                System.out.println("Quitting the program");
                break;
            }

            else if(action.equals("C") || action.equals("c")) {

                System.out.println("Enter the weight of the car in kg: ");
                double weight = kb.nextDouble();

                kb.nextLine();

                System.out.println("Choose a planet....'E' for Earth or 'M' for Moon: ");
                String choice = kb.nextLine();

                if(choice.equals("E") || choice.equals("e"))
                    System.out.printf("Weight of the car in the earth %.2f Newton%n", weight * 9.81);
                else if (choice.equals("M") || choice.equals("m"))
                    System.out.printf("Weight of the car in the moon %.2f Newton%n", weight * 9.81 / 6);
                else
                    System.out.println("Please enter correct choose");
            }

            else
                System.out.println("Incorrect choice...try again");
        }
    }
}
