package Lesson35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        //Из массива элементов Integer перебросить элементы в List.
        //Если число кратно 3 заменить его на 0, иначе умножить на 10.
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};

        List<Integer> list = Arrays.stream(numbers)
                .map(number -> {
                    if (number % 3 == 0) {
                        return 0;
                    } else {
                        return number * 10;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
