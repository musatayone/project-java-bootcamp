package Lesson11;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение суммы в тг: ");
        double kztValue = sc.nextDouble();

        System.out.println("Введите код валюты в которую хотите перевести(USD, EUR, RUB): ");
        String code = sc.next();

        double result = kztValue / getCurrentCurrencyRate(code);

        System.out.println("Сумма в " + code + ": " + result);
    }

    static double getCurrentCurrencyRate(String currencyCode) {
        double rate;
        switch (currencyCode) {
            case "USD":
                rate = 69.5;
                break;
            case "EUR":
                rate = 79.5;
                break;
            case "RUB":
                rate = 1.05;
                break;
            default:
                rate = 1;
        }
        return rate;
    }
}
