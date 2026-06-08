package Lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Получить от пользователя число, и вывести на экран
        //таблицу умножения этого числа, используя
        //конструкцию цикла for
        //
        //Пример:
        //
        //Введите число: 8
        //
        //8 * 1 = 8
        //
        //8 * 2 = 16
        //
        //…
        //
        //8 * 10 = 80

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифру: ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++) {
            System.out.println(n + "*" + i + " = " + n*i);
        }
    }
}
