package Lesson34;

public class Task5 {
    static int counter = 0;

    public static void main(String[] args) {
        //На основании задачи 4 получить
        //ошибки изменения локальных переменных
        //Попробовать заменить их переменными класса

        Calculator sum = (a, b) -> {
            counter++;
            return a + b;
        };
        System.out.println(sum.calculate(5, 3));
        System.out.println(sum.calculate(10, 20));

        System.out.println("Лямбда вызвана " + counter + " раза");
    }
}
