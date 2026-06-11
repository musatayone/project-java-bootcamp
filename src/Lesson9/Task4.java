package Lesson9;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //Задачи
        // Напишите программу, которая заполняет квадратную матрицу
        //случайными числами в интервале [1,9] и находит среднее
        //арифметическое всех элементов.
        // Пример:
        //Матрица А:
        //11 12 13
        //14 12 12
        //50 51 99
        //Среднее Арифметическое: 30,444444

        Random rand = new Random();
        int [] [] matrix = new int[3][3];
        matrix[0][0] = rand.nextInt(9);
        matrix[0][1] = rand.nextInt(9);
        matrix[0][2] = rand.nextInt(9);
        matrix[1][0] = rand.nextInt(9);
        matrix[1][1] = rand.nextInt(9);
        matrix[1][2] = rand.nextInt(9);
        matrix[2][0] = rand.nextInt(9);
        matrix[2][1] = rand.nextInt(9);
        matrix[2][2] = rand.nextInt(9);

        int sum = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        double elements = matrix.length * matrix[0].length;
        double avg = (double) sum / (elements);
        System.out.println("Среднее = " + avg);
    }
}
