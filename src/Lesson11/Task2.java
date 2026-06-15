package Lesson11;

public class Task2 {
    public static void main(String[] args) {
        // Написать функцию, которая вычисляет сумму цифр числа,
        // возвращает ее пользователю. Если сумма больше 1000
        // написать в консоль сообщение, что сумма больше 1000.

        int number = 12345;
        int result = sumDigits(number);

        System.out.println("Сумма цифр = " + result);


    }

    public static int sumDigits(int number) {

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        if (sum > 1000) {
            System.out.println("Сумма больше 1000");
        }

        return sum;

    }
}
