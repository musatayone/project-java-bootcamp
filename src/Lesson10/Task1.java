package Lesson10;

public class Task1 {
    public static void multiplicationTable() {
        // Напишите программу, с использованием
        //процедур, для вывода таблицы умножения
        //от 1 до 10.
        for (int firstElement = 1; firstElement <= 10; firstElement++) {
            for (int secondElement = 1; secondElement <= 10; secondElement++) {
                System.out.println(firstElement + " * " + secondElement + " = " + firstElement * secondElement);
            }
        }
    }

    public static void main(String[] args) {
        Task1 m = new Task1();
        m.multiplicationTable();
    }
}
