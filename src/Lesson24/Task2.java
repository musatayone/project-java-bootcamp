package Lesson24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Сделать age - Integer
        //Переместить кошек из списка в массив

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Пума", 2));
        cats.add(new Cat("Барс", 2));
        cats.add(new Cat("Лошка", 3));
        cats.add(new Cat("Вилка", 4));

        Cat[] catArray = cats.toArray(new Cat[cats.size()]);
        for (int i = 0; i < cats.size(); i++) {
            catArray[i] = cats.get(i);
        }

        System.out.println();
        System.out.println("Кошки в массиве:");

        for (Cat cat : catArray) {
            System.out.println(cat);
        }
    }
}
