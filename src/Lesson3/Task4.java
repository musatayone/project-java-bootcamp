package Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        if(a == b && b == c) {
            System.out.println("Все числа равны");
        } else if(a == b || b == c || c == a) {
            System.out.println("Два числа одинаковые");
        } else {
            System.out.println("Нет одинаковых числе");
        }
    }
}
