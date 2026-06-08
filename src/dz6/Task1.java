package dz6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //Создать свой массив, инициализировать его значения и вывести все его
        //четные(по индексу) элементы
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Четные элементы массива
        //Пример:
        //Допустим мой массив состоял из чисел от 10 до 20
        //Входные данные Выходные данные
        //Четные элементы массива:
        //10 12 14 16 18 20

        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(11);
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
