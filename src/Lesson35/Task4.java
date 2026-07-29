package Lesson35;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Получить список студентов у которых оценка за экзамен >= 4. Вывести.
        //Посчитать кол-во студентов которые получили 2 за экзамен.

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Мусатай Диас Шоханулы", 5));
        students.add(new Student("Петров Диас Шоханулы", 2));
        students.add(new Student("Сидоров Диас Шоханулы", 4));
        students.add(new Student("Смирнов Диас Шоханулы", 3));
        students.add(new Student("Егоров Диас Шоханулы", 5));
        students.add(new Student("Кузнецов Диас Шоханулы", 2));

        System.out.println("Студенты с оценкой >= 4:");
        students.stream()
                .filter(student -> student.getGrade() > 4)
                .forEach(System.out::println);

        long count = students.stream()
                .filter(student -> student.getGrade() == 2)
                .count();

        System.out.println();
        System.out.println("Количество двоек: " + count);
    }
}
