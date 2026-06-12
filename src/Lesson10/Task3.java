package Lesson10;

public class Task3 {
    public static void printAvg(int a, int b) {
        double avg = (a + b) / 2.0;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        printAvg(a, b);
    }
}
