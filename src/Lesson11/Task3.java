package Lesson11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Написать программу, которая принимает от пользователя валюту,
        // сумму и тип операции(покупка или продажа). Получает результат в сомах.
        // Лимит суммы 200 тыс – если привышает, выводим отрицательное
        // сообщение и сумму которую отказываемся выдавать.
        // Подсказка Задайте 2 массива, в одном будут курсы продаж,
        // а в другом – курсы покупки. Важно, чтобы индексы в
        // обеих массивах указывали на одну и ту же валюту.
        // продажа 69, 78, 1, 0.33 покупка 68, 77, 0.8, 0.25

        Scanner sc = new Scanner(System.in);

        System.out.print("Валюта: ");
        String currency = sc.next();

        System.out.print("Сумма: ");
        double amount = sc.nextDouble();

        System.out.print("Операция (покупка/продажа): ");
        String operation = sc.next();

        double result = exchange(currency, amount, operation);

        if (result == -1) {
            System.out.println("Такой валюты нет.");
        } else if (result > 200000) {
            System.out.println("Отказ. Сумма превышает лимит");
        } else {
            System.out.println("К выдаче: " + result + " сом");
        }
    }

    public static double exchange(String currency, double amount, String operation) {

        double rate = 0;

        if (currency.equals("USD")) {
            rate = operation.equals("покупка") ? 68 : 69;
        } else if (currency.equals("EUR")) {
            rate = operation.equals("покупка") ? 77 : 78;
        } else if (currency.equals("RUB")) {
            rate = operation.equals("покупка") ? 0.8 : 1;
        } else if (currency.equals("KZT")) {
            rate = operation.equals("покупка") ? 0.25 : 0.33;
        } else {
            return -1;
        }

        return amount * rate;
    }
}
