package dz26;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        //	Создать Класс Собака
        //	Добавить в Set 40 Далматинцев
        //	Не допускать добавления одинаковых далматицев (имя и вес отличаются).
        //	Сделать так чтобы далматинцы рассказали о себе.

        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 1; i <= 40; i++) {
            dogs.add(new Dog("Далматинец " + i, 2 + i));
        }
        System.out.println("Количество собак: " + dogs.size());

        dogs.add(new Dog("Далматинец 1", 3));
        dogs.add(new Dog("Далматинец 2", 4));

        System.out.println("После повторного добавления: " + dogs.size());
        System.out.println();

        for (Dog dog : dogs) {
            dog.tellAbout();
        }
    }
}
