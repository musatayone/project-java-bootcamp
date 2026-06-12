package Lesson11;


import java.util.Scanner;

/**
 * Task1.
 *
 * @author shabdanbek.m
 * Date: 12.06.2026
 */
public class ClassTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму в тенге: ");
        double kztValue = sc.nextDouble();

        System.out.println("Введите код валюты в которую хотите преоброзавать(USD, EUR, KGS): ");
        String code = sc.next();

        double result = kztValue / getCurrencyRateFunction(code);

        System.out.println("Сумма в " + code + ": " + result);
        System.out.printf("Сумма в %s: %.2f", code, result);
    }

    static double getCurrencyRateFunction(String code) {
        return switch (code) {
            case "USD" -> 559.3;
            case "EUR" -> 580.3;
            case "KGS" -> 5.3;
            default -> 1;
        };
    }

}
