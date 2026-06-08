package dz7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
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

        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == min) {
                minCount++;
            }

            if (array[i] == max) {
                maxCount++;
            }
        }

        System.out.println("Минимальный элемент: " + min +
                ", количество: " + minCount);

        System.out.println("Максимальный элемент: " + max +
                ", количество: " + maxCount);


    }
}
