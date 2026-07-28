package Lesson33;

public class Task2 {
    public static void main(String[] args) {
        //Предыдущий пример очень наивный.
        //Потому что работает только для 3 элементов.
        //Переделайте код так чтобы метод
        //принимал массив сравниваемых элементов и
        //возвращал максимальное из списка.

        Integer[] numbers = {3, 4, 5, 10, 2, 8};
        Double[] doubles = {1.1, 5.5, 2.2, 7.7};
        String[] words = {"шапка", "куртка", "туфли", "ботинки"};

        System.out.println(findMax(numbers));
        System.out.println(findMax(doubles));
        System.out.println(findMax(words));
    }

    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
