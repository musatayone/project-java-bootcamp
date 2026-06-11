package Lesson9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Задача
        // Введите массив с клавиатуры и найдите (за один проход)
        //количество элементов, имеющих максимальное значение
        //Пример
        //Массив:
        //3 4 5 5 3 5 4
        //Максимальное значение: 5
        //Количество элементов: 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Введи индекс массива: ");
        int n = sc.nextInt();

        System.out.println("Введи данные внутри массива: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Количество элементов: " + count);

    }
}
