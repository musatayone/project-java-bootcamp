package Lesson29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
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

        Collection<String> people = workers.values();
        System.out.println();
        System.out.println("Люди:");
        System.out.println(people);

        people.remove("Белоус");
        System.out.println();
        System.out.println("После удаления:");

        System.out.println("Collection:");
        System.out.println(people);

        System.out.println("HashMap:");
        System.out.println(workers);

        workers.put("Министр спорта", "Иванов");

        System.out.println();
        System.out.println("После добавления:");

        System.out.println("Collection:");
        System.out.println(people);

        System.out.println("HashMap:");
        System.out.println(workers);
    }
}
