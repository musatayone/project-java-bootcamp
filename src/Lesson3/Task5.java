package Lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int a = sc.nextInt();

        if (a>12) {
            System.out.println("Ошибка, нет же таких месяцев далбаеб");
        } else if (a == 12 || a <= 2) {
            System.out.println("Это зима");
        } else if (a >= 3 && a <= 5) {
            System.out.println("Это весна");
        } else if (a >= 6 && a <= 8) {
            System.out.println("Это лето");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Это осень");
        }
    }
}
