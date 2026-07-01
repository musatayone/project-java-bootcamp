package Lesson26;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        //Создать список из повторяющихся чисел от 1 до 100. Длиной в 400 элементов
        //1…100…1…100…1..100…1…100
        //Выгрузить все элементы, посчитать сумму.
        //Добавить все элементы в HashSet
        //Повторить вычисления

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 100; j++){
                numbers.add(j);
            }
        }

        int sum = 0;
        for(Integer i : numbers){
            sum += i;
        }

        System.out.println("Размер ArrayList: " + numbers.size());
        System.out.println("Сумма ArrayList: " + sum);

        Set<Integer> set = new HashSet<>(numbers);
        int setSum = 0;

        for(Integer i : set){
            setSum += i;
        }

        System.out.println();
        System.out.println("Размер HashSet: " + set.size());
        System.out.println("Сумма HashSet: " + setSum);
    }
}
