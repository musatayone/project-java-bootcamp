package dz2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double n = scanner.nextDouble();

        double result = Math.sqrt(n);

        System.out.println("Квадратный корень равен: " + result);
    }
}