package Lesson23;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Перебираем числа от 1 до 100
        //Отсортировать числа в списке так чтобы сначала шли нечетные, а в затем чётные.

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }

        for(Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        System.out.println(result);
    }
}
