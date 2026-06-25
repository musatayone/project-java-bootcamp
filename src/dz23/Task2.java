package dz23;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //Задача Б. Работа с листами
        //	Создайте ArrayList
        //	Заполните случайными числами от 1 до 100 (50 чисел)
        //	Разделите по разным листам, в один четные числа, в другой нечетные числа
        //	Выведите в консоль

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(101));
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Все числа:");
        System.out.println(numbers);

        System.out.println();

        System.out.println("Четные числа:");
        System.out.println(evenNumbers);

        System.out.println();

        System.out.println("Нечетные числа:");
        System.out.println(oddNumbers);
    }
}
