package Lesson29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> workers = new HashMap<>();

        ArrayList<String> pensioners = new ArrayList<>();

        workers.put("Президент", "Ельцин");
        workers.put("Премьер-министр", "Наруто");
        workers.put("Министр обороны", "Белоус");
        workers.put("Министр иностранных дел", "Конаев");

        pensioners.add(workers.get("Президент"));
        workers.put("Президент", "Путин");

        System.out.println("HashMap:");
        System.out.println(workers);

        Set<String> positions = workers.keySet();
        System.out.println();
        System.out.println("Set должностей:");
        System.out.println(positions);

        positions.remove("Министр обороны");

        System.out.println();
        System.out.println("После удаления:");

        System.out.println("Set:");
        System.out.println(positions);

        System.out.println("HashMap:");
        System.out.println(workers);

        workers.put("Министр спорта", "Иванов");

        System.out.println();
        System.out.println("После добавления:");

        System.out.println("Set:");
        System.out.println(positions);

        System.out.println("HashMap:");
        System.out.println(workers);
    }
}
