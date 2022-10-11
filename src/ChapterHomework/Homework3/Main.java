package ChapterHomework.Homework3;

public class Main {
    public static void main(String[] args) {
        String first = "walt";   //Erkbay
        String last = "savitch";  //Enkelbay
        String result = result(first) + " " + result(last);
        System.out.println(result);  //"Erkbay Enkelbay"

    }

    public static String result(String str) {
        str = str.trim();
        return str.substring(1,2).toUpperCase() + str.substring(2) + str.substring(0,1) + "ay";
    }
}
