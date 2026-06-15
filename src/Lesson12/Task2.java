package Lesson12;

public class Task2 {
    public static void main(String[] args) {
        // Измерить площадь прямоугольника
        // 1. Создать класс (шаблон, эскиз прямоугольника)
        // 2. Создать свойства(переменные) объекта
        // 3. Создать объект класса
        // 4. Установить ширину и высоту объекта
        // 5. Измерить площадь

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 10;

        int area = rectangle.sumArea();
        System.out.println("Площадь прямоугольника = " + area);
    }
}
