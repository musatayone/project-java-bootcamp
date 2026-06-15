package dz11;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Задача A. Минимальный элемент
        //Заполнить массив случайными числами и написать функцию которая найдет
        // и вернет индекс минимального элемента.
        // При этом в основной программе нужно будет вывести сообщение как в примере
        //Минимальный размер массива 5
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Весь массив, минимальный элемент и его индекс
        //Пример:
        //Входные данные	Выходные данные
        //	"Массив:
        //1 3 11 5 6 9
        //Минимальный элемент A[0] = 1"

        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }

        System.out.println("Массив:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int minIndex = findMinIndex(arr);
        int minValue = arr[minIndex];

        System.out.println("Минимальный элемент A[" + minIndex + "] = " + minValue);

    }

    public static int findMinIndex(int[] arr) {

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
