package dz2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите угол: ");
        int n = scanner.nextInt();

        int adjacentAngle = 180 - n;

        System.out.println("Смежный угол равен: " + adjacentAngle);
    }
}