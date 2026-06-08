package Lesson6;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // Задача, Подсчёт нужных элементов:
        //Создать массив длиной в 20, записать в массив случайные значения
        //роста от (170 до 220). Сколько из них имеет рост больше 180 см, но
        //меньше 190 см? Подсчитать, вывести эти значения и вывести их
        //(баскетболистов чей рост больше 180, но меньше 190) средний
        //рост.

        Random random = new Random();
        int[] array = new int[20];

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 170 + random.nextInt(51);
            System.out.println("Рост: " + array[i]);
            if (180 > array[i] && array[i] < 190) {
                count++;
                sum += array[i];
            }
        }
        System.out.println("Количество баскетболистов 180-190: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Средний рост: " + average);
        } else {
            System.out.println("Ошибка ғой");
        }
    }
}

