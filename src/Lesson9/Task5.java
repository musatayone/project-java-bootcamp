package Lesson9;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        //Задачи
        // Напишите программу, которая заполняет квадратную матрицу случайными
        //числами в интервале [10,99] и находит максимальный и минимальный
        //элементы в матрице и их индексы
        // Пример:
        //Матрица А:
        //12 14 67 45
        //32 87 45 63
        //69 45 14 11
        //40 12 35 15
        //Максимальный элемент A[1][1] = 87
        //Минимальный элемент A[2][3] = 11

        Random rand = new Random();
        int[][] keanuReeves = new int[4][4];

        for (int i = 0; i < keanuReeves.length; i++) {
            for (int j = 0; j < keanuReeves[0].length; j++) {
                keanuReeves[i][j] = rand.nextInt(90) + 10;
                System.out.print(keanuReeves[i][j] + " ");
            }
            System.out.println();
        }
        int maxElement = keanuReeves[0][0];
        int minElement = keanuReeves[0][0];

        int maxI = 0;
        int minI = 0;

        int maxJ = 0;
        int minJ = 0;

        for (int i = 0; i < keanuReeves.length; i++) {
            for (int j = 0; j < keanuReeves[0].length; j++) {
                if (keanuReeves[i][j] > maxElement) {
                    maxElement = keanuReeves[i][j];
                    maxI = i;
                    maxJ = j;
                } else if (keanuReeves[i][j] < minElement) {
                    minElement = keanuReeves[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("Максимальный элемент A[" + maxI + "][" + maxJ + "] = " + maxElement);
        System.out.println("Минимальный элемент A[" + minI + "][" + minJ + "] = " + minElement);
    }
}
