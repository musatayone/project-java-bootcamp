package dz7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        // Задача A. Максимальный и минимальный элементы массива
        //Заполнить массив случайными числами и найти минимальный и
        //максимальный элементы массива и их индекс
        //Минимальный размер массива 10
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Весь массив, максимальный и минимальный элементы и их индексы
        //Пример:
        //
        //Входные данные Выходные данные
        //
        //Массив:
        //1 3 11 5 6 9
        //Минимальный элемент A[0] = 1
        //Максимальный элемент A[2] = 11

        Random rand = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = array[0];
        int minIndex = 0;

        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Минимальный элемент A[" + minIndex + "] = " + min);
        System.out.println("Максимальный элемент A[" + maxIndex + "] = " + max);

        }
    }