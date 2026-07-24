package Lesson30;

import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        //В TreeSet сохранить дни недели
        //DayOfWeek (ID, Day)
        //Вывести все элементы.

        TreeSet<DayOfWeek> days = new TreeSet<>();

        days.add(new DayOfWeek(1, "Понедельник"));
        days.add(new DayOfWeek(2, "Вторник"));
        days.add(new DayOfWeek(3, "Среда"));
        days.add(new DayOfWeek(4, "Четверг"));
        days.add(new DayOfWeek(5, "Пятница"));
        days.add(new DayOfWeek(6, "Суббота"));
        days.add(new DayOfWeek(7, "Воскресенье"));

        System.out.println("Дни недели:");

        for (DayOfWeek day : days) {
            System.out.println(day);
        }
    }
}
