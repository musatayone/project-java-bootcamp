package Lesson26;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Создать класс Multiple который содержит 2 поля A, B – Integer
        //Создать список из Multiple
        //Создать метод который позволяет заполнять список только при уникальных произведениях A и  B
        //A = 10, B = 10 (результат перемножения 100)
        //A = 3, B = 5 (15, можно добавить в список)
        //A = 20, B = 5 (100, нельзя, т.к. 100 уже есть)

        ArrayList<Multiple> list = new ArrayList<>();
        addMultiple(list, 10, 10);
        addMultiple(list, 3, 5);
        addMultiple(list, 20, 5);
        addMultiple(list, 7, 8);
        addMultiple(list, 4, 25);

        System.out.println();
        for (Multiple m : list) {
            System.out.println(m);
        }
    }

    public static void addMultiple(ArrayList<Multiple> list, int a, int b) {
        int result = a * b;

        for (Multiple multiple : list) {
            if (multiple.getResult() == result) {
                System.out.println("Произведение " + result + " уже есть. Добавление запрещено.");
                return;
            }
        }

        list.add(new Multiple(a, b));
        System.out.println("Добавлено: " + a + " * " + b);
    }
}
