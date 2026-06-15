package Lesson12;

public class Task3 {
    public static void main(String[] args) {
        //Используя предыдущий класс,
        //Нужно дать возможность задать длину и ширину прямоугольника
        //Создать квадрат указанной ширины (длина и ширина равны).
        //Создать атрибут «цвет» и окрасить квадрат в нужный цвет.
        //При установке высоты или ширины проверять – не отрицательное ли значение, не равно ли оно нулю.

        Rectangle rect = new Rectangle();

        rect.setWidth(5);
        rect.setHeight(10);
        rect.setColor("red");

        System.out.println("Прямоугольник:");
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Высота: " + rect.getHeight());
        System.out.println("Цвет: " + rect.getColor());

        System.out.println("----------------");

        Rectangle square = new Rectangle();
        square.makeSquare(4);
        square.setColor("black");

        System.out.println("Квадрат:");
        System.out.println("Ширина: " + square.getWidth());
        System.out.println("Высота: " + square.getHeight());
        System.out.println("Цвет: " + square.getColor());
    }
}
