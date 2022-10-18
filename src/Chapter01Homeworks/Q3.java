package Chapter01Homeworks;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        String first = "walt";
        String last ="savitch";

        String result = result(first) + " " + result(last);
        System.out.println(result);  //"Erkbay Enkelbay"

    }

    public static String result(String str) {
        str = str.trim();
        return str.substring(1,2).toUpperCase() + str.substring(2) + str.substring(0,1) + "ay";
    }
}
