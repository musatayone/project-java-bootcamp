package Lesson22;

public class Task1 {
    public static void main(String[] args) {
        //Заполнить массив объектами Cat (свойство имя).
        //Один из элементов отметить как null
        //Попытаться считать данные с массива Cat объекты.
        //Если ловим пустой элемент - обработать эту ошибку

        Cat [] cats = new Cat[4];

        cats[0] = new Cat("Барс");
        cats[1] = new Cat("Пума");
        cats[2] = null;
        cats[3] = new Cat("Сакен");

        for(int i = 0; i <= cats.length; i++) {
            try {
                System.out.println(cats[i].getName());
            } catch (NullPointerException e) {
                System.out.println("Элемент " + i + " пустой");
            }
        }
    }
}
