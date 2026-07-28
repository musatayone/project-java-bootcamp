package Lesson33;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //Создать класс или интерфейс Жидкость, которую можно переливать.
        //Создать дочерний класс Сок.
        //Создать метод который принимает коллекцию Жидкостей и переливает их.
        //Сделать так, чтобы по правилам жидкости можно было переливать Сок.

        ArrayList<Juice> juices = new ArrayList<>();
        juices.add(new Juice("Яблочный"));
        juices.add(new Juice("Апельсиновый"));
        juices.add(new Juice("Цитрусовый"));

        pourLiquids(juices);
    }

    private static void pourLiquids(ArrayList<? extends Liquid> liquids) {
        for (Liquid liquid : liquids) {
            liquid.pour();
        }
    }
}
