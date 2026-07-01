package Lesson26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Создать класс «Кошка».
        //Создать двух кошек. Считать их hashcode.
        //Переопределить equals.
        //Сравнить кошек в ArrayList.
        //Есть ли похожие.
        //Переопределить создание кода

        Cat cat1 = new Cat("Пума", 2);
        Cat cat2 = new Cat("Барс",2);

        System.out.println("Hashcode первой кошки: " + cat1.hashCode());
        System.out.println("Hashcode второй кошки: " + cat2.hashCode());

        System.out.println("Коты равны? " + cat1.equals(cat2));

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        System.out.println("Есть ли похожая кошка?");
        System.out.println(cats.contains(cat2));
    }
}
