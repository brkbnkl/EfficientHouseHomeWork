package Chapter01Homeworks;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int cuponNumber = 36;

        int getCandy = cuponNumber / 10 ;

        cuponNumber = cuponNumber % 10;

        int getGumball = cuponNumber / 3;

        cuponNumber = cuponNumber % 3;

        System.out.println("Alabileceğimiz candy sayisi : " + getCandy);
        System.out.println("Alabileceğimiz gumball sayisi : " + getGumball);
        System.out.println("Artan kupon sayısı : " + cuponNumber);
        }
    }




