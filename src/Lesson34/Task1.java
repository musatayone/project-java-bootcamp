package Lesson34;

public class Task1 {
    public static void main(String[] args) {
        //Создать интерфейс «Тестируемый».
        //В интерфейсе «Тестируемый» один метод «сдать тест»
        //Создать класс Студент который реализует интерфейс «Тестируемый».
        //Протестировать:
        //студента Ивана
        //Некого Тестируемого Петра
        //Некого Тестируемого Сергея.

        Student ivan = new Student("Ivan");
        ivan.passTest();

        Testable petr = new Student("Petr");
        petr.passTest();

        Testable sergey = new Student("Sergey");
        sergey.passTest();
    }
}
