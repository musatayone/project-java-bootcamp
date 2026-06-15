package dz11;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //Задача D. Четные числа
        //Написать функцию, которая проверят является ли число четным,
        //если четное возвращает true иначе false. Используйте вызов данной функции в коде.
        //Минимальный размер массива 5 элементов.
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Вывод на Ваше усмотрение

        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Четные числа:");

        for (int i = 0; i < arr.length; i++) {
            if (isEvenNumber(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        boolean b = number % 2 == 0;
        return b;
    }
}
