package chapter01homeworks;


public class Q2 {
    public static void main(String[] args) {

        int cuponNumber = 36;

        int getCandy = cuponNumber / 10 ;

        cuponNumber = cuponNumber % 10;

        int getGumball = cuponNumber / 3;

        cuponNumber = cuponNumber % 3;

        System.out.println("The number of candies you can buy : " + getCandy);
        System.out.println("The number of gums you can buy : " + getGumball);
        System.out.println("Increased number of coupons : " + cuponNumber);
        }
    }




