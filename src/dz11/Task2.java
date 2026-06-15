package dz11;

public class Task2 {
    public static void main(String[] args) {
        //Задача C. Сумма кратных чисел
        //Имеются числа от 1 до 100 включительно.
        // Нужно собрать сумму чисел кратных 3, сумму чисел кратных 4.
        // И вывести их сумму
        //Только нужно использовать функции
        //*Очень желательно написать именно одну функцию (не две) для получения суммы.
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Сумма чисел кратных 3, сумма кратных 4, и их разница

        int sumOfThrees = sumMultiples(1, 100, 3);
        int sumOfFours = sumMultiples(1, 100, 4);

        int resultDifference = sumOfThrees - sumOfFours;

        System.out.println("Сумма кратных 3: " + sumOfThrees);
        System.out.println("Сумма кратных 4: " + sumOfFours);
        System.out.println("Разница: " + resultDifference);
    }
    public static int sumMultiples(int start, int end, int number) {

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % number == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
