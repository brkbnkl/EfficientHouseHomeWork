package Chapter01Homeworks;

public class Q8 {

    public static final double distance = 6.21;

    public static void main(String[] args)
    {

        double time;
        System.out.println("This program calculates vehicle average speed" +
                "given a time and distance traveled.");
                time = 20.5;
        double average_speed = distance / time;
        System.out.println("Car average speed is " + average_speed
                + " miles per hour.");
    }

}
