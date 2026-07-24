package Lesson30;

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        //Создать 2 TreeSet.
        //Первый {a, b, c, d, e}
        //Второй {a, c, d, f, g}
        //Добавить в первый TreeSet те элементы
        //которых нет в первом, но есть во втором.
        //Со второго удалить дублирующиеся элементы

        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");

        set2.add("a");
        set2.add("c");
        set2.add("d");
        set2.add("f");
        set2.add("g");

        System.out.println("Первый TreeSet:");
        System.out.println(set1);

        System.out.println("Второй TreeSet:");
        System.out.println(set2);

        for(String s : set2) {
            if (!set1.contains(s)) {
                set1.add(s);
            }
        }

        set2.remove("a");
        set2.remove("c");
        set2.remove("d");

        System.out.println();
        System.out.println("После изменений:");

        System.out.println("Первый:");
        System.out.println(set1);

        System.out.println("Второй:");
        System.out.println(set2);
    }
}
