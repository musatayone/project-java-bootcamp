package Lesson29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //Создать Map. Ключ – должность. Значение – ФИО.
        //Должность президента занимал Ельцин. Его сменил Путин.
        //Ельцин стал пенсионером (ArrayList)
        //Использовать механизм совпадения по put.

        Map<String, String> workers = new HashMap<>();
        ArrayList<String> pensioners = new ArrayList<>();

        workers.put("Президент", "Ельцин");
        System.out.println("До смены:");
        System.out.println(workers);

        pensioners.add(workers.get("Президент"));
        workers.put("Президент", "Путин");

        System.out.println();
        System.out.println("После смены:");
        System.out.println(workers);

        System.out.println();
        System.out.println("Пенсионеры:");
        System.out.println(pensioners);

    }
}
