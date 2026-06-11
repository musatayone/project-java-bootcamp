package dz9;

public class Task1 {
    public static void main(String[] args) {
        //Задача B. Таблица умножения
        //
        //Вывести полную таблицу умножения от 1 до 10, использую вложенные
        //циклы
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Таблица умножения

        for(int firstElement = 1; firstElement <= 10; firstElement++) {
            for(int secondElement = 1; secondElement <= 10; secondElement++) {
                System.out.println(firstElement + "*" + secondElement + "=" + firstElement*secondElement);
            }
        }


    }
}
