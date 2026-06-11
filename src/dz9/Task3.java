package dz9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Задача E.
        //
        //Ввести натуральное число N и вывести все натуральные числа, не
        //превосходящие N и делящиеся на каждую из своих цифр.
        //Формат входных данных
        //Целое натуральное число N
        //Формат выходных данных
        //Список чисел из задания
        //Пример:
        //
        //Входные данные Выходные данные
        //15 1 2 3 4 5 6 7 8 9 11 12 15

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            int temp = i;
            boolean flag = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0 || i % digit != 0) {
                    flag = false;
                    break;

                }
                temp /= 10;
            }
            if (flag) {
                System.out.println(i + " ");
            }

        }
    }
}
