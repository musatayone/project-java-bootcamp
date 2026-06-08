package dz1;

import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();

        System.out.println("Введите третье число: ");
        double c = sc.nextDouble();

        System.out.println("Введите четвертое число: ");
        double d = sc.nextDouble();

        System.out.println("Введите пятое число: ");
        double e = sc.nextDouble();

        System.out.println("Введите шестое число: ");
        double f = sc.nextDouble();

        System.out.println("Введите седьмое число: ");
        double k = sc.nextDouble();

        System.out.println("Введите восьмое число: ");
        double p = sc.nextDouble();

        System.out.println("Введите девятое число: ");
        double g = sc.nextDouble();

        double result = ((a + b) * c + (d * e / f)) / ((k + (p * b / a) + g)) * 4 / 5;

        System.out.printf("%.5f", result);
    }
}