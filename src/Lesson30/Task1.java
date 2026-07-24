package Lesson30;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(0);
        numbers.add(9);
        numbers.add(7);

        System.out.println(numbers);
        System.out.println();

        Set<String> names = new TreeSet<>();
        names.add("Наруто");
        names.add("Саске");
        names.add("Сакура");
        names.add("Итачи");
        names.add("Какаши");
        names.add("Тсунаде");

        System.out.println(names);
    }
}
