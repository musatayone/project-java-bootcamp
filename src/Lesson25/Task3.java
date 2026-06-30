package Lesson25;

import static Lesson25.WeekDay.*;

public class Task3 {
    public static void main(String[] args) {
        //Создать перечисление для дней недели.
        //Задать день недели. Если это пн, ср, пт – то вывести
        //«Учёба в {понедельник}». Иначе вывести
        //«В {день_недели} я не учусь»
        //Вывести дни недели на русском языке.

        WeekDay weekDay = MONDAY;
        if (weekDay == WeekDay.MONDAY
                || weekDay == WeekDay.WEDNESDAY
                || weekDay == WeekDay.FRIDAY) {

            System.out.println("Учёба в " + getRussianDay(weekDay));

        } else {

            System.out.println("В " + getRussianDay(weekDay) + " я не учусь");
        }

        System.out.println();
        System.out.println("Все дни недели:");

        for (WeekDay day : WeekDay.values()) {
            System.out.println(getRussianDay(day));
        }
    }

    public static String getRussianDay(WeekDay day) {

        switch (day) {

            case MONDAY:
                return "понедельник";

            case TUESDAY:
                return "вторник";

            case WEDNESDAY:
                return "среда";

            case THURSDAY:
                return "четверг";

            case FRIDAY:
                return "пятница";

            case SATURDAY:
                return "суббота";

            case SUNDAY:
                return "воскресенье";

            default:
                return "";

        }
    }
}
