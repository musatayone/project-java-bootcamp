package Lesson30;

import java.util.Arrays;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        //Добавить в TreeSet месяцы.
        //Проверить, имеется ли месяц «Март»
        //Удалить месяц «Ноябрь»
        //Первый и последний элемент вывести в массив.
        //Добавить уже имеющийся месяц в TreeSet.

        TreeSet<String> months = new TreeSet<>();

        months.add("Январь");
        months.add("Февраль");
        months.add("Март");
        months.add("Апрель");
        months.add("Май");
        months.add("Июнь");
        months.add("Июль");
        months.add("Август");
        months.add("Сентябрь");
        months.add("Октябрь");
        months.add("Ноябрь");
        months.add("Декабрь");

        System.out.println("Все месяцы:");
        System.out.println(months);

        if(months.contains("Март")) {
            System.out.println("Март найден");
        } else {
            System.out.println("Март не найден");
        }

        months.remove("Ноябрь");
        System.out.println("После удаления ноября:");
        System.out.println(months);

        String[] array = new String[2];
        array[0] = months.first();
        array[1] = months.last();

        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        months.add("Март");
        System.out.println("После повторного добавления марта:");
        System.out.println(months);

        System.out.println("Размер TreeSet = " + months.size());
    }
}
