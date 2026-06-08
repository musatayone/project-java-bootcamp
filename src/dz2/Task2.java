package dz2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько секунд?");
        int n = scanner.nextInt();

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.println(hours + " час " + minutes + " минута " + seconds + " секунда ");
    }
}