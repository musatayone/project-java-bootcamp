package Lesson9;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        //Задача
        // Яркости пикселей рисунка закодированы числами от 0 до 255 в виде
        //матрицы. Преобразить рисунок в черно-белый по следующему алгоритму:
        // Вычислить среднюю яркость пикселей по всему рисунку
        // Все пиксели, яркость которых меньше средней, сделать черными (записать код
        //0), а остальные – белыми (код 255)
        // Пример:
        //Матрица А:
        //12 14 67 45
        //32 87 45 63
        //69 45 14 11
        //40 12 35 15
        //Средняя яркость: 37.88
        //Результат
        //0 0 255 255
        //0 255 0 255
        //255 255 0 0
        //255 0 0 0

        Random rand = new Random();

        int[][] trinity = new int[4][4];
        for (int i = 0; i < trinity.length; i++) {
            for (int j = 0; j < trinity[i].length; j++) {
                trinity[i][j] = rand.nextInt(100);
                System.out.print(trinity[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < trinity.length; i++) {
            for (int j = 0; j < trinity[i].length; j++) {
                sum += trinity[i][j];
            }
        }
        double elements = trinity.length * trinity[0].length;
        double avg = (double) sum / (elements);
        System.out.println("Среднее = " + avg);

        for (int i = 0; i < trinity.length; i++) {
            for (int j = 0; j < trinity[i].length; j++) {
                if (trinity[i][j] < avg) {
                    trinity[i][j] = 0;
                } else {
                    trinity[i][j] = 255;
                }
            }
        }

        for (int i = 0; i < trinity.length; i++) {
            for (int j = 0; j < trinity[i].length; j++) {
                System.out.print(trinity[i][j] + " ");
            }
            System.out.println();
        }
    }
}
