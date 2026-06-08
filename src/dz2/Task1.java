package dz2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько часов?");
        int hours = scanner.nextInt();

        System.out.println("Сколько минут?");
        int minutes = scanner.nextInt();

        System.out.println("Сколько секунд?");
        int seconds = scanner.nextInt();

        System.out.println("Итого секунд: ");
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        System.out.println(totalSeconds);
    }
}