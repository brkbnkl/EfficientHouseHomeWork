package ChapterHomework.Homework9;

public class Main {
    public static void main(String[] args) {
        int minWeight = 110;
        int heightFeet = 6;
        int heightInch = heightFeet * 12;
        int bodyWeight = minWeight + (heightFeet %60) *5;

        System.out.printf("Height : " + heightFeet + " " + "Ideal body weight :" + bodyWeight);
    }
}
