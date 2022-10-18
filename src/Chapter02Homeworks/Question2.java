package Chapter02Homeworks;


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kupon sayısı giriniz:");
        int cuponNumber = scan.nextInt();  //36

        int getCandy = cuponNumber / 10 ;

        cuponNumber = cuponNumber % 10;

        int getGumball = cuponNumber / 3;

        cuponNumber = cuponNumber % 3;

        System.out.println("Alabileceğimiz candy sayisi : " + getCandy);
        System.out.println("Alabileceğimiz gumball sayisi : " + getGumball);
        System.out.println("Artan kupon sayısı : " + cuponNumber);
        }
    }




