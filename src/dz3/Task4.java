package dz3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите вещественное число двойной точности: ");
        double number = sc.nextDouble();

        long result = Math.round(number);

        System.out.println("Целое число, округленное по правилам математики - " + result);
    }
}