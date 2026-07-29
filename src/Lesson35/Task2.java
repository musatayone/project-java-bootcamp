package Lesson35;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //От каждого элемента стрима нужно получить 10%
        //Каждую строку в списке задублировать (ОляОля, ЮляЮля)
        //Создать класс Student (ID, FIO). Получить в стриме список фамилий.

        int[] numbers = {100, 200, 300, 400};

        Arrays.stream(numbers)
                .mapToDouble(x -> x * 0.1)
                .forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>();
        names.add("Диас");
        names.add("Даулет");
        names.add("Аскар");

        names.stream()
                .map(name -> name + name)
                .forEach(System.out::println);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Мусатай Диас Шоханулы"));
        students.add(new Student(2,"Тоганбаев Даулет Агамемнонулы"));

        students.stream()
                .map(student -> student.getFIO().split(" ")[0])
                .forEach(System.out::println);
    }
}
