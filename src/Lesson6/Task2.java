package Lesson6;

import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Задача
        //Заполните массив случайными числами в интервале
        //от 0 до 100 включительно и найдите среднее
        //арифметическое его значений
        //Пример:
        //Массив:
        //1 2 3 4 5
        //Среднее арифметическое 3.0
        Random rand = new Random();

        int[] array = new int[5];
        int size = array.length;
        int sum = 0;

        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(101);
            System.out.println(array[i]);
            sum += array[i];
        }
        double average = (double) sum / size;
        System.out.println("Среднее арифметическое: " + average);
    }
}
