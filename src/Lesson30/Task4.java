package Lesson30;

import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        //Заполнить TreeSet цифрами от 1 до 1000.
        //Получить
        //А = сумму чисел от 5 до 700
        //B = Сумму чисел до 30
        //C = Сумму чисел от 980
        //Какой процент составляют в общей сумме числа а, b, c

        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        int totalSum = 0;
        for (Integer number : numbers) {
            totalSum += number;
        }

        int sumA = 0;
        for (Integer number : numbers.subSet(5, true, 700, true)) {
            sumA += number;
        }

        int sumB = 0;
        for (Integer number : numbers.headSet(30, true)) {
            sumB += number;
        }

        int sumC = 0;
        for (Integer number : numbers.tailSet(980, true)) {
            sumC += number;
        }

        double percentA = (double) sumA * 100 / totalSum;
        double percentB = (double) sumB * 100 / totalSum;
        double percentC = (double) sumC * 100 / totalSum;

        System.out.println("Общая сумма = " + totalSum);

        System.out.println("A = " + sumA);
        System.out.println("B = " + sumB);
        System.out.println("C = " + sumC);
        System.out.println();

        System.out.printf("A = %.2f%%\n", percentA);
        System.out.printf("B = %.2f%%\n", percentB);
        System.out.printf("C = %.2f%%\n", percentC);
    }
}
