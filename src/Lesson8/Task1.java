package Lesson8;

public class Task1 {
    public static void main(String[] args) {
        String[] students = {
                "Наруто",
                "Саске",
                "Сакура",
                "Итачи",
                "Какаши",
                "Мадара",
                "Обито",
                "Пейн",
                "Нагато",
                "Джирайя"
        };

        for (int i = students.length - 1; i >= 0; i--) {

            if ((i + 1) % 2 == 0) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }
}