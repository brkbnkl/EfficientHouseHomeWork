package ChapterHomework.Homework7;

public class Main {
    public static void main(String[] args) {

        int seconds = 50391;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
