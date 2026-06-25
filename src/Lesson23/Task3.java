package Lesson23;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //Создать список в котором содержатся числа, которые являются квадратами.
        // Найти все такие числа до числа 10000.
        //Сохранить в отдельном списке все индексы элементов, которые кратны 2 или 3

        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 0; i <= 1000; i++){
            squares.add(i * i);
        }

        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < squares.size(); i++){
            if(i % 2 == 0 || i % 3 == 0){
                indexes.add(i);
            }
        }
        System.out.println("Квадраты:");
        System.out.println(squares);

        System.out.println();

        System.out.println("Индексы кратные 2 или 3:");
        System.out.println(indexes);
        }
    }