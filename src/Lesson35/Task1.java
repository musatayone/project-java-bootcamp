package Lesson35;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Создать массив из чисел. Вывести в стриме каждый элемент в квадрате (a*a).
        //Создать список строчных элементов. Вывести элементы заменив в строке букву «а»  на  «о»

        int[] numbers = {2,4,6,8,10};
        Arrays.stream(numbers)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
