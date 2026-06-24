package Lesson23;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Создать список в котором содержатся числа, которые являются квадратами.
        //Найти все такие числа до числа 10000.

        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 0; i <= 1000; i++){
            squares.add(i * i);
        }
        System.out.println(squares);
    }
}
