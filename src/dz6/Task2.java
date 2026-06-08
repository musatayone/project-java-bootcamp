package dz6;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Задача B. Заполнение массива через консоль.
        //Напишите программу, которая создает массив, и позволяет
        //пользователю самостоятельно его заполнить. Вывести весь массив, а
        //также среднее арифметическое всех введенных чисел
        //Формат входных данных
        //Целые числа
        //Формат выходных данных
        //Все элементы массива, и целое арифметическое
        //Пример:
        //Входные данные Выходные данные
        //5 4 3 2 1 5 4 3 2 1
        //Среднее арифметическое
        //массива: 3.0


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println((double) sum / n);

    }
}
