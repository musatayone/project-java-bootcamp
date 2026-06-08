package Lesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Написать программу, которая получает диапазон чисел
        //от пользователя и суммирует все нечётные числа в
        //данном диапазоне.
        //
        //Пример:
        //
        //Введите диапазон:
        //
        //10 20
        //
        //Сумма нечётных чисел в диапазоне: 75

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите диапазон чисел: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        } System.out.println("Сумма нечетных чисел внутри диапазона: " + sum);
    }
}
