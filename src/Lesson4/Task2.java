package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println("Введите число:");
            n = sc.nextInt();
        }

        System.out.println("До свидания!");
    }
}
