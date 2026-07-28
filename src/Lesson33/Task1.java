package Lesson33;

import java.util.Collection;

public class Task1 {
    public static void main(String[] args) {
        //Написать Generic метод который возвращает последний или первый элемент массива.
        //Массивы могут быть любого типа.

        Integer[] numbers = {10, 20, 30, 40};
        String[] names = {"Иван", "Петр", "Саша"};
        Double[] doubles = {1.5, 2.7, 3.9};

        System.out.println(getFirst(numbers));
        System.out.println(getLast(numbers));

        System.out.println(getFirst(names));
        System.out.println(getLast(names));

        System.out.println(getFirst(doubles));
        System.out.println(getLast(doubles));
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static <T> T getLast(T[] array) {
        return array[array.length - 1];
    }
}
