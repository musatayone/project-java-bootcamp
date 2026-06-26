package Lesson24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Создать класс «Кошка». Свойства Имя и возраст (сделать int)
        //Создать конструктор
        //В другом классе заполнить список кошек.
        //Найти кошку по возрасту и имени.
        //Попробовать использовать indexOf() , contains().

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Пума", 2));
        cats.add(new Cat("Барс", 2));
        cats.add(new Cat("Лошка", 3));
        cats.add(new Cat("Вилка", 4));

        Cat catSearch = new Cat("Вилка", 4);
        System.out.println("Contains: "
                + cats.contains(catSearch));

        System.out.println("Index: "
                + cats.indexOf(catSearch));
    }
}
