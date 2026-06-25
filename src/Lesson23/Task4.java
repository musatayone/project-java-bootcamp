package Lesson23;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Перебираем числа от 1 до 100
        //Отсортировать числа в списке так чтобы сначала шли нечетные, а в затем чётные.
        //Удаляем из списка все чётные числа.

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
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

        System.out.println("После сортировки:");
        System.out.println(result);

        for(int i = result.size()-1; i >= 0; i--) {
            if (result.get(i) % 2 == 0) {
                result.remove(i);
            }
        }

        System.out.println();
        System.out.println("После удаления четных:");
        System.out.println(result);
    }
}
