package Lesson34;

public class Task2 {
    public static void main(String[] args) {
        //В предыдущую задачу с тестируемыми
        //добавить двух лямбда тестируемых
        //«Хаскелл Карри» и «Алонзо Чёрч».

        Student ivan = new Student("Ivan");
        ivan.passTest();

        Testable petr = new Student("Petr");
        petr.passTest();

        Testable sergey = new Student("Sergey");
        sergey.passTest();

        Testable haskell = () ->
                System.out.println("Хаскелл Карри сдал тест");
        haskell.passTest();

        Testable church = () ->
                System.out.println("Алонзо Чёрч сдал тест");
        church.passTest();
    }
}
