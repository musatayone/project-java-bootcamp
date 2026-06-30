package dz24;

import Lesson24.Cat;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Cat> arrayList = new ArrayList<>();
        LinkedList<Cat> linkedList = new LinkedList<>();

        // Заполняем списки
        for (int i = 1; i <= 1_000_000; i++) {
            arrayList.add(new Cat("Кот " + i));
            linkedList.add(new Cat("Кот " + i));
        }

        LocalDateTime start;
        LocalDateTime end;

        // =====================
        // Добавить в середину
        // =====================

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            arrayList.add(arrayList.size() / 2, new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long arrayMiddleAdd = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            linkedList.add(linkedList.size() / 2, new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long linkedMiddleAdd = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Добавить в начало
        // =====================

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            arrayList.add(0, new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long arrayStartAdd = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            linkedList.addFirst(new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long linkedStartAdd = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Добавить в конец
        // =====================

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            arrayList.add(new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long arrayEndAdd = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            linkedList.addLast(new Cat("Кот"));
        }

        end = LocalDateTime.now();

        long linkedEndAdd = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Получить из середины
        // =====================

        start = LocalDateTime.now();
        arrayList.get(arrayList.size() / 2);
        end = LocalDateTime.now();

        long arrayMiddleGet = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();
        linkedList.get(linkedList.size() / 2);
        end = LocalDateTime.now();

        long linkedMiddleGet = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Получить с конца
        // =====================

        start = LocalDateTime.now();
        arrayList.get(arrayList.size() - 1);
        end = LocalDateTime.now();

        long arrayEndGet = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();
        linkedList.getLast();
        end = LocalDateTime.now();

        long linkedEndGet = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Удалить из середины
        // =====================

        start = LocalDateTime.now();
        arrayList.remove(arrayList.size() / 2);
        end = LocalDateTime.now();

        long arrayMiddleRemove = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();
        linkedList.remove(linkedList.size() / 2);
        end = LocalDateTime.now();

        long linkedMiddleRemove = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Удалить из начала
        // =====================

        start = LocalDateTime.now();
        arrayList.remove(0);
        end = LocalDateTime.now();

        long arrayStartRemove = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();
        linkedList.removeFirst();
        end = LocalDateTime.now();

        long linkedStartRemove = ChronoUnit.MILLIS.between(start, end);

        // =====================
        // Вывод
        // =====================

        System.out.println("Добавление в середину:");
        System.out.println("ArrayList: " + arrayMiddleAdd + " мс");
        System.out.println("LinkedList: " + linkedMiddleAdd + " мс");

        System.out.println();

        System.out.println("Добавление в начало:");
        System.out.println("ArrayList: " + arrayStartAdd + " мс");
        System.out.println("LinkedList: " + linkedStartAdd + " мс");

        System.out.println();

        System.out.println("Добавление в конец:");
        System.out.println("ArrayList: " + arrayEndAdd + " мс");
        System.out.println("LinkedList: " + linkedEndAdd + " мс");

        System.out.println();

        System.out.println("Получение из середины:");
        System.out.println("ArrayList: " + arrayMiddleGet + " мс");
        System.out.println("LinkedList: " + linkedMiddleGet + " мс");

        System.out.println();

        System.out.println("Получение с конца:");
        System.out.println("ArrayList: " + arrayEndGet + " мс");
        System.out.println("LinkedList: " + linkedEndGet + " мс");

        System.out.println();

        System.out.println("Удаление из середины:");
        System.out.println("ArrayList: " + arrayMiddleRemove + " мс");
        System.out.println("LinkedList: " + linkedMiddleRemove + " мс");

        System.out.println();

        System.out.println("Удаление из начала:");
        System.out.println("ArrayList: " + arrayStartRemove + " мс");
        System.out.println("LinkedList: " + linkedStartRemove + " мс");

        System.out.println();
        System.out.println("Статистика:");
        System.out.println("ArrayList быстрее читает элементы по индексу.");
        System.out.println("LinkedList быстрее добавляет и удаляет элементы в начале списка.");
    }
}