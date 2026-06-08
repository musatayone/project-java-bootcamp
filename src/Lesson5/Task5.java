package Lesson5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Написать программу, которая получает числа, до тех
        //пор, пока пользователь не введёт 0. После ввода 0,
        //отобразить в консоль количество введенных чисел(не
        //считая 0), их сумму и общее арифметическое
        //
        //Пример:
        //Введите число: 5
        //Введите число: 4
        //Введите число: 3
        //Введите число: 2
        //Введите число: 1
        //Введите число: 0
        //Количество введенных чисел: 5
        //Сумма: 15
        //Среднее арифметическое: 3.0

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int num;

        for (; ; ) {
            System.out.println("Введите число: ");
            num = sc.nextInt();

            if (num == 0) break;
            count++;
            sum += num;
        }
        double average = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Количество введенных чисел: " + count);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}


