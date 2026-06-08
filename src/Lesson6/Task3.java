package Lesson6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // Задача
        //Заполните массив случайными числами в интервале
        //от 0 до 100 включительно и подсчитайте отдельно
        //среднее значение всех элементов, которые <50, и
        //среднее значение всех элементов, которые ≥50.
        //Пример:
        //Массив:
        //3 2 52 4 60
        //Среднее арифметическое элементов [0, 49] 3.0
        //Среднее арифметическое элементов [50, 100] 56.0
        Random rand = new Random();

        int[] array = new int[6];
        int size = array.length;
        int sum1 = 0;
        int count1 = 0;

        int sum2 = 0;
        int count2 = 0;

        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(101);
            System.out.println(array[i]);
            if (array[i] < 50) {
                sum1 += array[i];
                count1++;
            } else {
                sum2 += array[i];
                count2++;
            }

            }

        double average1 = count1 == 0 ? 0 : (double) sum1 / count1;
        double average2 = count2 == 0 ? 0 : (double) sum2 / count2;

        System.out.println("Среднее < 50: " + average1);
        System.out.println("Среднее >= 50: " + average2);
    }
}
