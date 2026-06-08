package dz2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество углов: ");
        int n = scanner.nextInt();

        System.out.println("Введите длину одной стороны: ");
        int a = scanner.nextInt();

        int perimeter = n * a;

        System.out.println("Периметр фигуры равен: " + perimeter);
    }
}