package dz23;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Задача A.Работа с листами
        //	Создать список из предложений
        //Ветер с моря дул
        //Нагонял беду
        //И сказал ты мне
        //Больше не приду
        //	Продублировать слова в списке (в песне каждое предложение повторяется).
        //	Если предложение длиннее 13 символов перенести данные в другой массив.
        //	Из второго массива удалить предложение «И сказал ты мне».

        ArrayList<String> song = new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Нагонял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");

        ArrayList<String> duplicate = new ArrayList<>();
        for (String s : song) {
            duplicate.add(s);
            duplicate.add(s);
        }

        System.out.println("После дублирования:");
        System.out.println(duplicate);

        ArrayList<String> longLines = new ArrayList<>();
        for (String s : duplicate) {
            if(s.length() > 13) {
                longLines.add(s);
            }
        }
        System.out.println();
        System.out.println("Второй список:");
        System.out.println(longLines);

        while(longLines.remove("И сказал ты мне")) {
        }

        System.out.println();
        System.out.println("После удаления:");
        System.out.println(longLines);
    }
}
