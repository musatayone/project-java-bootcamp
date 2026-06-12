package Lesson10;

public class Task4 {
    // Задача
    //
    //Напишите процедуру, которая принимает
    //параметр – натуральное число N – и выводит на
    //экран линию из N символов ‘-’(тире).
    //
    //Пример:
    //Введите N:
    //10
    //----------

    public static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        printLine(a);
    }
}
